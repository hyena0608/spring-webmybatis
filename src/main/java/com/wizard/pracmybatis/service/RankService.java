package com.wizard.pracmybatis.service;

import com.wizard.pracmybatis.domain.Employee;
import com.wizard.pracmybatis.domain.Rank;
import com.wizard.pracmybatis.dto.EmpComDepDto;
import com.wizard.pracmybatis.dto.EmployeeCompanyDto;
import com.wizard.pracmybatis.repository.EmployeeRepository;
import com.wizard.pracmybatis.repository.RankRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RankService {

    private final RankRepository rankRepository;

    public void save(Rank rank) {
        rankRepository.save(rank);
    }

}
