//package com.wizard.pracmybatis.service;
//
//import com.wizard.pracmybatis.domain.Company;
//import com.wizard.pracmybatis.domain.CompanyType;
//import org.assertj.core.api.Assertions;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@Transactional
//public class CompanyServiceTest {
//
//    @Autowired
//    private CompanyService companyService;
//
//    @Test
//    public void 회사_생성() throws Exception {
//        // given
//        Company company = new Company("회사1", CompanyType.MAJOR);
//
//        // when
//        int savedCount = companyService.save(company);
//
//        // then
//        Assertions.assertThat("회사1").isEqualTo(company.getName());
//        Assertions.assertThat(savedCount).isEqualTo(1);
//    }
//
//}