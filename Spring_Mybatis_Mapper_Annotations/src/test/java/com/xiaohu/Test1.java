package com.xiaohu;

import com.xiaohu.dao.CustomersDaoInterface;
import com.xiaohu.entity.Customers;
import com.xiaohu.service.CustomersServiceInterface;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class Test1{

    @Test
    public void FindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        CustomersServiceInterface customersServiceInterface = (CustomersServiceInterface) ac.getBean("customersServiceImpl");
        List<Customers> all = customersServiceInterface.findAll();
        System.out.println(all);
    }
}
