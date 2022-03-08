//package com.wizard.pracmybatis.service;
//
//import com.wizard.pracmybatis.domain.*;
//import com.wizard.pracmybatis.repository.CompanyRepository;
//import com.wizard.pracmybatis.repository.DepartmentRepository;
//import com.wizard.pracmybatis.repository.EmployeeRepository;
//import com.wizard.pracmybatis.repository.RankRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@Transactional
//public class EmployeeServiceTest {
//
//    @Autowired
//    private EmployeeRepository employeeService;
//
//    @Autowired
//    private CompanyRepository companyService;
//
//    @Autowired
//    private DepartmentRepository departmentService;
//
//    @Autowired
//    private RankRepository rankRepository;
//
//    @Test
//    public void 직원_회사_부서_리스트_가져오기기() throws Exception {
//        // given
//        Company company = new Company("회사1", CompanyType.MAJOR);
//        companyService.save(company);
//        Department department = new Department("부서1", DepartmentType.DEVELOP, company.getId());
//        departmentService.save(department);
//        Rank rank = new Rank(RankType.SAWON);
//        rankRepository.save(rank);
//        Employee employee = new Employee("직원1", 4, company.getId(), department.getId(), rank.getId());
//        employeeService.save(employee);
//
//        // when
//        // then
//    }
//
//}