package com.wizard.pracmybatis.controller;

import com.wizard.pracmybatis.domain.Department;
import com.wizard.pracmybatis.domain.Employee;
import com.wizard.pracmybatis.dto.EmployeeCompanyDto;
import com.wizard.pracmybatis.service.DepartmentService;
import com.wizard.pracmybatis.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping("/list")
    public List<Department> getList() {
        return departmentService.getList();
    }

    @GetMapping("/{id}")
    public Department get(@PathVariable int id) {
        return departmentService.get(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Department department) {
        departmentService.save(department);
    }

    @PatchMapping("/update/{id}")
    public void save(@PathVariable int id, @RequestBody Department department) {
        departmentService.update(department);
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        departmentService.delete(id);
    }

}
