package com.wizard.pracmybatis.service;

import com.fasterxml.jackson.core.JsonParser;
import com.wizard.pracmybatis.domain.Company;
import com.wizard.pracmybatis.domain.Department;
import com.wizard.pracmybatis.domain.Employee;
import com.wizard.pracmybatis.dto.EmpComDepDto;
import com.wizard.pracmybatis.repository.CompanyRepository;
import com.wizard.pracmybatis.repository.DepartmentRepository;
import com.wizard.pracmybatis.repository.EmployeeRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class EmployeeServiceTest {

    @Autowired
    private EmployeeRepository employeeService;

    @Autowired
    private CompanyRepository companyService;

    @Autowired
    private DepartmentRepository departmentService;

    @Test
    public void 직원_회사_부서_리스트_가져오기기() throws Exception {
        // given
        Company company = new Company("회사1", "회사주소1");
        companyService.save(company);
        Department department = new Department("부서1", "부서주소1", "부서1 입니다", company.getId());
        departmentService.save(department);
        Employee employee = new Employee("직원1", "직원 주소1", company.getId(), department.getId());
        employeeService.save(employee);

        // when
        List<EmpComDepDto> resultList = employeeService.getEmpComDepList();
        int c_id = resultList.get(resultList.size()-1).getC_id();
        // then
        Assertions.assertThat(c_id).isEqualTo(company.getId());
    }

}