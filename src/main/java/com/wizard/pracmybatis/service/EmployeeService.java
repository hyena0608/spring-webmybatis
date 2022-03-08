package com.wizard.pracmybatis.service;

import com.wizard.pracmybatis.domain.Employee;
import com.wizard.pracmybatis.dto.EmployeeCompanyDto;
import com.wizard.pracmybatis.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getList() {
        return employeeRepository.getList();
    }

    public Employee get(int id) {
        return employeeRepository.get(id);
    }

    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    public void update(Employee employee) {
        employeeRepository.update(employee);
    }

    public void delete(int id) {
        employeeRepository.delete(id);
    }

    public List<EmployeeCompanyDto> getEmployeeCompanyList() {
        return employeeRepository.getEmployeeCompanyList();
    }
}
