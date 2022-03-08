package com.wizard.pracmybatis.dto;

import lombok.Getter;

@Getter
public class EmpComDepDto {

    private String e_name;
    private String e_address;
    private int c_id;
    private String c_name;
    private String c_address;
    private int d_id;
    private String d_name;
    private String d_address;
    private String d_intro;

    private EmpComDepDto() {
    }

    public EmpComDepDto(String e_name, String e_address, int c_id, String c_name, String c_address, int d_id, String d_name, String d_address, String d_intro) {
        this.e_name = e_name;
        this.e_address = e_address;
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_address = c_address;
        this.d_id = d_id;
        this.d_name = d_name;
        this.d_address = d_address;
        this.d_intro = d_intro;
    }
}
