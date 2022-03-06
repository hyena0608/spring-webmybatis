package com.wizard.pracmybatis.controller;

import com.wizard.pracmybatis.domain.Board;
import com.wizard.pracmybatis.service.BoardService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping
    public List<Board> getList() {
        return boardService.getList();
    }

    @GetMapping("/{boardSeq}")
    public Board get(@PathVariable int boardSeq) {
        return boardService.get(boardSeq);
    }

    @GetMapping("/save")
    public void save(Board board) {
        boardService.save(board);
    }

    @GetMapping("/delete/{boardSeq}")
    public void delete(@PathVariable int boardSeq) {
        boardService.delete(boardSeq);
    }
}
