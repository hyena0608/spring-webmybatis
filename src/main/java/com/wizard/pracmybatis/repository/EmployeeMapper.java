package com.wizard.pracmybatis.repository;

import com.wizard.pracmybatis.domain.Employee;
import lombok.Data;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Insert("INSERT INTO" +
            " employee(employee_name, employee_address, company_id)" +
            " VALUES(#{employee.name}, #{employee.address}, #{employee.company_id})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(@Param("employee") Employee employee);

//    @SelectProvider(type = EmployeeSqlbuilder.class, method = "")

    /**
     * Employee join Company
     */
    @Select("SELECT * FROM" +
            " employee e " +
            " join company c" +
            " ON e.company_id = c.id")
    @ResultType(EmployeeCompanyDto.class)
    List<EmployeeCompanyDto> getAfterJoin();


    /**
     * Employee
     */

    @Data
    class EmployeeCompanyDto {
        private String employee_name;
        private String employee_address;
        private int company_id;
        private String company_name;
        private String company_address;
    }
}
