package com.wizard.pracmybatis.salaryCal;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.LongFunction;
import java.util.stream.Collectors;

@Getter
public class YearBy {

    final Double OneToFive = 1.003;
    final Double FiveToTen = 1.045;
    final Double TentoTwenty = 1.06;
    /**
     * 1 - 5년 : 3%
     * 5 - 10년: 4.5%
     * 10 - 20년: 6%
     */

    private List<Long> salaryList = new ArrayList<>();

    public List<Long> calYears(Double salary) {
        salaryList.add(Math.round(salary));
        for (int i = 2; i <= 5; i++) {
            salaryList.add(Math.round(salary * OneToFive));
            salary *= OneToFive;
        }
        for (int i = 6; i <= 10; i++) {
            salaryList.add(Math.round(salary * FiveToTen));
            salary *= FiveToTen;
        }
        for (int i = 11; i <= 20; i++) {
            salaryList.add(Math.round(salary * TentoTwenty));
            salary *= TentoTwenty;
        }
        return salaryList;
    }

}
