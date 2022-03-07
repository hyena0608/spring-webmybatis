package com.wizard.pracmybatis.domain;

import lombok.Getter;

@Getter
public class Employee {

      private int id;
      private String name;
      private String address;
      private int company_id;

      public Employee(String name, String address, int company_id) {
            this.name = name;
            this.address = address;
            this.company_id = company_id;
      }
}
