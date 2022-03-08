package com.wizard.pracmybatis.service;

import com.wizard.pracmybatis.domain.Company;
import com.wizard.pracmybatis.domain.Department;
import com.wizard.pracmybatis.repository.CompanyRepository;
import com.wizard.pracmybatis.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public List<Department> getList() {
        return departmentRepository.getList();
    }

    public Department get(int id) {
        return departmentRepository.get(id);
    }

    public void save(Department department) {
        departmentRepository.save(department);
    }

    public void update(Department department) {
        departmentRepository.update(department);
    }

    public void delete(int id) {
        departmentRepository.delete(id);
    }
}
