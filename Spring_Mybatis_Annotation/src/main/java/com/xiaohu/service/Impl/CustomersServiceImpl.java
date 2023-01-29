package com.xiaohu.service.Impl;

import com.xiaohu.entity.Customers;
import com.xiaohu.service.CustomersService;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class CustomersServiceImpl implements CustomersService {

    private QueryRunner queryRunner;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    public List<Customers> findCustomers() {
        try{
            return queryRunner.query("select * from customers",new BeanListHandler<Customers>(Customers.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Customers findCustomersById(Integer customerNumber) {
        try{
            return queryRunner.query("select * from customers",new BeanHandler<Customers>(Customers.class),customerNumber);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveCustomers(Customers customers) {
        try{
            queryRunner.update("insert into customers(customerNumber,customerName,contactLastName," +
                    "contactFirstName,phone,addressLine1,addressLine2,city,state,postalCode,country,salesRepEmployeeNumber,creditLimie)" +
                    " values (?,?,?,?,?,?,?,?,?,?,?,?,?)",customers.getCustomernumber());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateCustomers(Customers customers) {
        try{
            queryRunner.update("update customers set customerName=? , contactLastName=? , phone=? where customerNumber = ?",
                    customers.getCustomername(),customers.getContactlastname(),customers.getPhone(),customers.getCustomernumber());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteCustomers(Integer customerNumber) {
        try{
            queryRunner.update("delete from customers where customerNumber = ?",customerNumber);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
