package com.wizard.pracmybatis.service;

import com.wizard.pracmybatis.domain.Board;
import com.wizard.pracmybatis.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public List<Board> getList() {
        return boardRepository.getList();
    }

    public Board get(int boardSeq) {
        return boardRepository.get(boardSeq);
    }

    public void save(Board board) {
        boardRepository.save(board);
    }

    public void update(Board board) {
        boardRepository.update(board);
    }

    public void delete(int boardSeq) {
        boardRepository.delete(boardSeq);
    }
}
