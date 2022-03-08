package com.wizard.pracmybatis.controller;

import com.wizard.pracmybatis.domain.Employee;
import com.wizard.pracmybatis.dto.EmpComDepDto;
import com.wizard.pracmybatis.dto.EmployeeCompanyDto;
import com.wizard.pracmybatis.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/list")
    public List<Employee> getList() {
        return employeeService.getList();
    }

    @GetMapping("/{e_id}")
    public Employee get(@PathVariable int e_id) {
        return employeeService.get(e_id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Employee employee) {
        employeeService.save(employee);
    }

    @PatchMapping("/update/{e_id}")
    public void save(@PathVariable int e_id, @RequestBody Employee employee) {
        employeeService.update(employee);
    }

    @GetMapping("/delete/{e_id}")
    public void delete(@PathVariable int e_id) {
        employeeService.delete(e_id);
    }

    @GetMapping("/eclist")
    public List<EmployeeCompanyDto> getEmployeeCompanyList() {
        return employeeService.getEmployeeCompanyList();
    }

    @GetMapping("/ecdlist")
    public List<EmpComDepDto> getEmpComDepList() {
        return employeeService.getEmpComDepList();
    }
}
