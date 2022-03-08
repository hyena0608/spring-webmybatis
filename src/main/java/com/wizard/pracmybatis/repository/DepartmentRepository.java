package com.wizard.pracmybatis.repository;

import com.wizard.pracmybatis.domain.Company;
import com.wizard.pracmybatis.domain.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository {

    List<Department> getList();

    Department get(int id);

    void save(Department department);

    void update(Department department);

    void delete(int id);

}
