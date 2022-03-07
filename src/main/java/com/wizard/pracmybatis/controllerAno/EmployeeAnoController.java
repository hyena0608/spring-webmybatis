package com.wizard.pracmybatis.controllerAno;

import com.wizard.pracmybatis.domain.Employee;
import com.wizard.pracmybatis.repository.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.wizard.pracmybatis.repository.EmployeeMapper.*;


@RestController
@RequiredArgsConstructor
public class EmployeeAnoController {

    private final EmployeeMapper employeeMapper;

    @PostMapping("/prac2/employee/insert")
    public int insert(@RequestBody Employee employee) {
        return employeeMapper.insert(employee);
    }

    @GetMapping("prac2/employee/join")
    public List<EmployeeCompanyDto> join() {
        List<EmployeeCompanyDto> result = employeeMapper.getAfterJoin();
        return result;
    }

}
