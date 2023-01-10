package com.xiaohu.service.Impl;


import com.xiaohu.entity.Customers;
import com.xiaohu.mapper.CustomersMapper;
import com.xiaohu.service.CustomersServiceInterface;

import java.util.List;

public class CustomersServiceImpl implements CustomersServiceInterface {

    private CustomersMapper customersMapper;

    public void setCustomersMapper(CustomersMapper customersMapper) {
        this.customersMapper = customersMapper;
    }

    @Override
    public List<Customers> findAll() {
        System.out.println("执行了findAll方法");
        return customersMapper.findAll();
    }


}
