package com.wizard.pracmybatis.dto;

import lombok.Data;
import lombok.Getter;

@Getter
public class EmployeeCompanyDto {

    private String e_name;
    private String e_address;
    private int c_id;
    private String c_name;
    private String c_address;

   public EmployeeCompanyDto() {

   }

    public EmployeeCompanyDto(String e_name, String e_address, int c_id, String c_name, String c_address) {
        this.e_name = e_name;
        this.e_address = e_address;
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_address = c_address;
    }
}
