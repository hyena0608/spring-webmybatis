package com.wizard.pracmybatis.domain;

import lombok.Getter;

@Getter
public class Employee {

      private int id;
      private String name;
      private String address;
      private int company_id;
      private int department_id;

      private Employee() {
      }

      public Employee(String name, String address, int company_id, int department_id) {
            this.name = name;
            this.address = address;
            this.company_id = company_id;
            this.department_id = department_id;
      }

      public Employee(int id, String name, String address, int company_id, int department_id) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.company_id = company_id;
            this.department_id = department_id;
      }
}
