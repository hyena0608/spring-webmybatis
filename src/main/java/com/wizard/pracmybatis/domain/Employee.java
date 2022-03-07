package com.wizard.pracmybatis.domain;

import lombok.Data;
import lombok.Getter;

@Data
public class Employee {

      private int id;
      private String EMPLOYEE_NAME;
      private String EMPLOYEE_ADDRESS;
      private int COMPANY_ID;

      private Employee() {
      }

      public Employee(int id, String EMPLOYEE_NAME, String EMPLOYEE_ADDRESS, int COMPANY_ID) {
            this.id = id;
            this.EMPLOYEE_NAME = EMPLOYEE_NAME;
            this.EMPLOYEE_ADDRESS = EMPLOYEE_ADDRESS;
            this.COMPANY_ID = COMPANY_ID;
      }
}
