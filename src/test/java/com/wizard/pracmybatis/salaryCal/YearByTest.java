package com.wizard.pracmybatis.salaryCal;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YearByTest {


    @Test
    public void 연도별_계산() throws Exception {
        //given
        Double mySalary = 30000000.0;

        //when
        List<Long> resultList = new YearBy().calYears(mySalary);
        System.out.println("resultList = " + resultList);

        //then
        Assertions.assertThat(resultList.size()).isEqualTo(20);
    }
}