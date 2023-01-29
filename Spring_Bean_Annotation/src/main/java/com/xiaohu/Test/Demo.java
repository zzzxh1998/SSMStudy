package com.xiaohu.Test;

import com.xiaohu.Config.SpringIocConfiguration;
import com.xiaohu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        //创建纯注解方式的Spring 容器
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringIocConfiguration.class);
        //根据类型容器获取Bean
        UserService userService1 = context.getBean(UserService.class);
        userService1.saveUser();
        //根据beanId从容器中获取Bean
        UserService userService2 = (UserService) context.getBean("userService");
        userService2.saveUser();
    }
}
