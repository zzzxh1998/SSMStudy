package com.xiaohu.Test;

import com.xiaohu.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) ac.getBean(Student.class);
        System.out.println(student);
    }
}
