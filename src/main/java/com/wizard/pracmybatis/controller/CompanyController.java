package com.wizard.pracmybatis.controller;

import com.wizard.pracmybatis.domain.Company;
import com.wizard.pracmybatis.domain.Employee;
import com.wizard.pracmybatis.dto.EmployeeCompanyDto;
import com.wizard.pracmybatis.service.CompanyService;
import com.wizard.pracmybatis.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping("/list")
    public List<Company> getList() {
        return companyService.getList();
    }

    @GetMapping("/{id}")
    public Company get(@PathVariable int id) {
        return companyService.get(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Company company) {
        companyService.save(company);
    }

    @PatchMapping("/update/{id}")
    public void save(@PathVariable int id, @RequestBody Company company) {
        companyService.update(company);
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        companyService.delete(id);
    }

}
