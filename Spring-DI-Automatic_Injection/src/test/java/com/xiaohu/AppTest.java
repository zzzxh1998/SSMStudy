package com.xiaohu;

import com.xiaohu.Service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AppTest {

    @Test
    public void Test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        IUserService iUserService = (IUserService) applicationContext.getBean("userServiceImpl");
        iUserService.print();
    }
}
