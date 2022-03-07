package com.wizard.pracmybatis.controllerAno;

import com.wizard.pracmybatis.domain.Company;
import com.wizard.pracmybatis.repository.CompanyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyMapper companyMapper;

    @PostMapping("/prac2/company/insert")
    public int post(@RequestBody Company company) {
        return companyMapper.insert(company);
    }

    @GetMapping("/prac2")
    public List<Company> findAll() {
        List<Company> result = companyMapper.getAll();
        return result;
    }

    @GetMapping("/prac2/{id}")
    public Company getById(@PathVariable("id") int id) {
        return companyMapper.getById(id);
    }

}