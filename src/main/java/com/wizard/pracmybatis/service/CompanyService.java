package com.wizard.pracmybatis.service;

import com.wizard.pracmybatis.domain.Board;
import com.wizard.pracmybatis.domain.Company;
import com.wizard.pracmybatis.repository.BoardRepository;
import com.wizard.pracmybatis.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public List<Company> getList() {
        return companyRepository.getList();
    }

    public Company get(int id) {
        return companyRepository.get(id);
    }

    public int save(Company company) {
         return companyRepository.save(company);
    }

    public void update(Company company) {
        companyRepository.update(company);
    }

    public void delete(int id) {
        companyRepository.delete(id);
    }
}
