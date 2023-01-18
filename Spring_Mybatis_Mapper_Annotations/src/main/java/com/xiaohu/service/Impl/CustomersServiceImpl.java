package com.xiaohu.service.Impl;

import com.xiaohu.dao.CustomersDaoInterface;
import com.xiaohu.entity.Customers;
import com.xiaohu.service.CustomersServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomersServiceImpl implements CustomersServiceInterface {

    @Autowired
    private CustomersDaoInterface customersDaoInterface;

    @Override
    public List<Customers> findAll() {
        System.out.println("执行了findAll方法");
        return customersDaoInterface.findAll();
    }
}
