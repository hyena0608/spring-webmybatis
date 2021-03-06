package com.wizard.pracmybatis.domain;

import lombok.Getter;

@Getter
public class Company {
    private int id;
    private String name;
    private String type;

    private Company() {}

    public Company(String name, Enum type) {
        this.name = name;
        this.type = String.valueOf(type);
    }
}
