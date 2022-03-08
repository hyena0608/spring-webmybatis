package com.wizard.pracmybatis.repository;

import com.wizard.pracmybatis.domain.Company;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CompanyMapper {

    @Insert("INSERT INTO company(name, address) VALUES(#{company.name}, #{company.address})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(@Param("company") Company company);

    @Select("SELECT * FROM company")
    @Results(id = "CompanyMap", value = {
            @Result(property = "name", column = "name"),
            @Result(property = "address", column = "address")
    })
    List<Company> getAll();

    @Select("SELECT * FROM company WHERE id=#{id}")
    @ResultMap("CompanyMap")
    Company getById(@Param("id") int id);

}
