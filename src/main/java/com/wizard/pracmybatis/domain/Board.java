package com.wizard.pracmybatis.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Board {

    private int boardSeq;
    private String title;
    private String contents;
    private LocalDate regDate;
}
