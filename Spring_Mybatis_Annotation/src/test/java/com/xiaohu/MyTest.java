package com.xiaohu;

import com.xiaohu.config.SpringConfig;
import com.xiaohu.entity.Customers;
import com.xiaohu.service.CustomersService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class MyTest {
    @Test
    public void testSave(){
        //获取Spring容器
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //得到业务层对象
        CustomersService customersService = (CustomersService) context.getBean("customersService");
        CustomersService customersService1 =  context.getBean("customersService", CustomersService.class);
        //获取Customers对象
        Customers customers = context.getBean("customers",Customers.class);
        customersService.saveCustomers(customers);
        customersService.findCustomers();
    }

    @Test
    public void findCustomers(){
        //获取Spring容器
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //得到业务层对象
        CustomersService customersService = (CustomersService) context.getBean("customersService");
        List<Customers> customers = customersService.findCustomers();
        System.out.println(customers);
    }
    @Test
    public void findCustomerById(){
        //获取Spring容器
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //得到业务层对象
        CustomersService customersService = (CustomersService) context.getBean("customersService");
        Customers customersById = customersService.findCustomersById(103);
        System.out.println(customersById);
    }
}
