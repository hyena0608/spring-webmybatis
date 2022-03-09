package com.wizard.pracmybatis.domain;

import lombok.Getter;

import java.math.BigInteger;

@Getter
public class Employee {

      private int id;
      private String name;
      private int first_salary;
      private int work_year;
      private int company_id;
      private int department_id;
      private int rank_id;

      private Employee() {
      }

      public Employee(String name, int first_salary, int work_year, int company_id, int department_id, int rank_id) {
            this.name = name;
            this.first_salary = first_salary;
            this.work_year = work_year;
            this.company_id = company_id;
            this.department_id = department_id;
            this.rank_id = rank_id;
      }
}
