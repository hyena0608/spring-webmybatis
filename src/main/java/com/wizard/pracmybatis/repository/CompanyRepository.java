package com.wizard.pracmybatis.repository;

import com.wizard.pracmybatis.domain.Company;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository {

    List<Company> getList();

    Company get(int id);

    int save(Company company);

    void update(Company company);

    void delete(int id);

}
