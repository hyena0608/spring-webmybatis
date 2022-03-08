package com.wizard.pracmybatis.domain;

import lombok.Getter;

@Getter
public class Department {

    private int id;
    private String name;
    private String address;
    private String intro;

    public Department(int id, String name, String address, String intro) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.intro = intro;
    }
}
