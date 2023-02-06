package com.xiaohu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("hello SpringMVC,sayHello方法启动");
        return "success";
    }
}
