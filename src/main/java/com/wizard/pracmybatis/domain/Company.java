package com.wizard.pracmybatis.domain;

import lombok.Getter;

@Getter
public class Company {
    private int id;
    private String name;
    private String address;

    private Company() {}

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Company(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
