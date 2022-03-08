package com.wizard.pracmybatis.domain;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Board {

    private int boardSeq;
    private String title;
    private String contents;
    private LocalDate regDate;

    private Board() {}

    public Board(int boardSeq, String title, String contents, LocalDate regDate) {
        this.boardSeq = boardSeq;
        this.title = title;
        this.contents = contents;
        this.regDate = regDate;
    }
}
