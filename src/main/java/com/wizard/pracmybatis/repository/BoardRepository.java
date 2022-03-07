package com.wizard.pracmybatis.repository;

import com.wizard.pracmybatis.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Mapper
public interface BoardRepository {

    List<Board> getList();

    Board get(int boardSeq);

    void save(Board board);

    void update(Board board);

    void delete(int boardSeq);
}
