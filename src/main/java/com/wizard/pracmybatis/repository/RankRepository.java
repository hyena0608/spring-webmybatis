package com.wizard.pracmybatis.repository;

import com.wizard.pracmybatis.domain.Rank;
import org.springframework.stereotype.Repository;


@Repository
public interface RankRepository {

    int save(Rank rank);

}
