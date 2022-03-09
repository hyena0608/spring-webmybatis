package com.wizard.pracmybatis.controller;

import com.wizard.pracmybatis.domain.Rank;
import com.wizard.pracmybatis.service.RankService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rank")
public class RankController {

    private final RankService rankService;

    @PostMapping("/save")
    public void save(@RequestBody Rank rank) {
        rankService.save(rank);
    }

}
