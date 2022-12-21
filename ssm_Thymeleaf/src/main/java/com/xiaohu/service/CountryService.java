package com.xiaohu.service;

import com.xiaohu.pojo.Country;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CountryService {
    Country getById(int id);
    Country updateById(int id);
    Country saveCountry();
    Country deleteById(int id);
    List<Country> queryByName(String name);
    List<Country> getAll();
}
