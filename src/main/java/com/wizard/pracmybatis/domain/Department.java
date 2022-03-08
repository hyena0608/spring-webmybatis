package com.wizard.pracmybatis.domain;

import lombok.Getter;

@Getter
public class Department {

    private int id;
    private String name;
    private String type;
    private int company_id;

    private Department() {}

    public Department(String name, Enum type, int company_id) {
        this.name = name;
        this.type = String.valueOf(type);
        this.company_id = company_id;
    }
}
