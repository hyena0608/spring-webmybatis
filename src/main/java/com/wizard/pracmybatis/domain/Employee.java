package com.wizard.pracmybatis.domain;

import lombok.Data;
import lombok.Getter;

@Data
public class Employee {

      private int id;
      private String employee_name;
      private String employee_address;
      private int company_id;

}
