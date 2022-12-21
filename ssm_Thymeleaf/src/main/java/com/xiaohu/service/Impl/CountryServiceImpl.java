package com.xiaohu.service.Impl;

import com.xiaohu.bean.CountryMapper;
import com.xiaohu.pojo.Country;
import com.xiaohu.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryMapper countryMapper;

    public void setCountryMapper(CountryMapper countryMapper) {
        this.countryMapper = countryMapper;
    }

    @Override
    public Country getById(int id) {
        return countryMapper.getById(id);
    }

    @Override
    public Country updateById(int id) {
        return countryMapper.updateById(id);
    }

    @Override
    public Country saveCountry() {
        return countryMapper.saveCountry();
    }

    @Override
    public Country deleteById(int id) {
        return countryMapper.deleteById(id);
    }

    @Override
    public List<Country> queryByName(String name) {
        return countryMapper.queryByName(name);
    }

    @Override
    public List<Country> getAll() {
        return countryMapper.getAll();
    }
}
