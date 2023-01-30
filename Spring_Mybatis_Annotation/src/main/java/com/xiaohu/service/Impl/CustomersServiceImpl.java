package com.xiaohu.service.Impl;

import com.xiaohu.dao.CustomersDao;
import com.xiaohu.entity.Customers;
import com.xiaohu.service.CustomersService;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service("customersService")
public class CustomersServiceImpl implements CustomersService {

    @Autowired
    private CustomersDao customersDao;

    public void setCustomersDao(CustomersDao customersDao) {
        this.customersDao = customersDao;
    }

    public List<Customers> findCustomers() {
       return customersDao.findCustomers();
    }

    public Customers findCustomersById(Integer customerNumber) {
        return customersDao.findCustomersById(customerNumber);
    }

    public void saveCustomers(Customers customers) {
        customersDao.saveCustomers(customers);
    }

    public void updateCustomers(Customers customers) {
        customersDao.updateCustomers(customers);
    }

    public void deleteCustomers(Integer customerNumber) {
        customersDao.deleteCustomers(customerNumber);
    }
}
