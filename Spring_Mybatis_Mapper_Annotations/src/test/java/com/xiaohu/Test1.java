package com.xiaohu;

import com.xiaohu.dao.CustomersDaoInterface;
import com.xiaohu.entity.Customers;
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
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomersDaoInterface customersDaoInterface = (CustomersDaoInterface) ac.getBean("customersServiceImpl");
        List<Customers> all = customersDaoInterface.findAll();
        System.out.println(all);
    }
}
