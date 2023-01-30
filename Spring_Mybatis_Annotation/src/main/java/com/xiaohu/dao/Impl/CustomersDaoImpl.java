package com.xiaohu.dao.Impl;

import com.xiaohu.dao.CustomersDao;
import com.xiaohu.entity.Customers;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository("customersDao")
public class CustomersDaoImpl implements CustomersDao {

        @Autowired
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
                return queryRunner.query("select * from customers where customerNumber = ? ",new BeanHandler<Customers>(Customers.class),customerNumber);
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
