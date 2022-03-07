package com.wizard.pracmybatis.repository;

import com.wizard.pracmybatis.domain.Employee;
import com.wizard.pracmybatis.domain.EmployeeCompanyDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository {

    List<Employee> getList();

    Employee get(int id);

    void save(Employee employee);

    void update(Employee employee);

    void delete(int id);

    List<EmployeeCompanyDto> getEmployeeCompanyList();

}
