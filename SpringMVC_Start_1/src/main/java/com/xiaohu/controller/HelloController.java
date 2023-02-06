package com.xiaohu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/user")
public class HelloController {

    @RequestMapping(path="/hello")
    public String sayHello(){
        System.out.println("sayHello方法调用了");
        return "success";
    }

    @RequestMapping(path = "/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("测试@RequestMpping注解");
        return "success";
    }

    @RequestMapping(path = "/testRequestMapping1",params = {"username"})
    public String testRequestMapping1(){
        System.out.println("测试@RequestMpping1注解");
        return "success";
    }
    @RequestMapping(path = "/testRequestMapping2",params = {"username=111"})
    public String testRequestMapping2(){
        System.out.println("测试@RequestMpping2注解");
        return "success";
    }
    @RequestMapping(path = "/testRequestMapping3",params = {"username=111"},headers = {"Accept"})
    public String testRequestMapping3(){
        System.out.println("测试@RequestMpping3注解");
        return "success";
    }
    @RequestMapping(path = "/testRequestMapping4",params = {"username=111"},headers = {"Accept"})
    public String testRequestMapping4(){
        System.out.println("测试@RequestMpping4注解");
        return "success";
    }


}
