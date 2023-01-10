package com.xiaohu;

import com.xiaohu.entity.Customers;
import com.xiaohu.service.CustomersServiceInterface;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test_1 {
    @Test
    public void Test_FindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomersServiceInterface customersServiceInterface = (CustomersServiceInterface) ac.getBean("customersServiceImpl");
        List<Customers> all = customersServiceInterface.findAll();
        System.out.println(all);
    }
}
