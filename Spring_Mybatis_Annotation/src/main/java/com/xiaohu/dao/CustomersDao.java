package com.xiaohu.dao;

import com.xiaohu.entity.Customers;

import java.util.List;

public interface CustomersDao {
    //查询所有
    List<Customers> findCustomers();
    //查询一个
    Customers findCustomersById(Integer customerNumber);
    //保存
    void saveCustomers(Customers customers);
    //更新
    void updateCustomers(Customers customers);
    //删除
    void deleteCustomers(Integer customerNumber);
}
