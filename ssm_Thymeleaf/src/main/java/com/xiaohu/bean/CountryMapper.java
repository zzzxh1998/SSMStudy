package com.xiaohu.bean;

import com.xiaohu.pojo.Country;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface CountryMapper {
    Country getById(int id);
    Country updateById(int id);
    Country saveCountry();
    Country deleteById(int id);
    List<Country> queryByName(String name);
    List<Country> getAll();

}
