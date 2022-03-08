package com.wizard.pracmybatis.domain;

import lombok.Getter;

@Getter
public class Rank {

    private int id;
    private String type;

    private Rank() {}

    public Rank(Enum type) {
        this.type = String.valueOf(type);
    }
}
