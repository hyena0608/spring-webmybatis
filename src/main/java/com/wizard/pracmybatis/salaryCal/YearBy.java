package com.wizard.pracmybatis.salaryCal;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class YearBy {

    /**
     * 1 - 5년 : 3%
     * 5 - 10년: 4.5%
     * 10 - 20년: 6%
     */
    private Double salary;
    List<Double> salaryList = new ArrayList<Double>();

    final Double OneToFive = 3.0;
    final Double FiveToTen = 4.5;
    final Double TentoTwenty = 6.0;

    public YearBy(Double salary) {
        this.salary = salary;

    }
}
