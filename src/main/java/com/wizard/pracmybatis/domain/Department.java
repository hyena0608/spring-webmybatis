package com.wizard.pracmybatis.domain;

import lombok.Getter;

@Getter
public class Department {

    private int id;
    private String name;
    private String address;
    private String intro;
    private int company_id;

    private Department() {}

    public Department(String name, String address, String intro, int company_id) {
        this.name = name;
        this.address = address;
        this.intro = intro;
        this.company_id = company_id;
    }

    public Department(int id, String name, String address, String intro, int company_id) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.intro = intro;
        this.company_id = company_id;
    }
}
