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
    private CustomersDaoInterface daoInterface;


    @Override
    public List<Customers> findAll() {
        System.out.println("执行查询所有方法");
        return daoInterface.findAll();
    }
}
