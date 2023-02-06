package com.xiaohu.controller;

import com.xiaohu.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/param")
public class ParamController {

    /*
    * 请求参数绑定入门
    * */
    @RequestMapping("testParam")
    public String testParam(){
        System.out.println("testParam方法执行了");
        return "success";
    }
    @RequestMapping("testParam1")
    public String testParam1(String username){
        System.out.println("testParam方法执行了");
        return "success";
    }
    @RequestMapping("testParam2")
    public String testParam2(String username,Integer password){
        System.out.println("testParam2方法执行了");
        return "success";
    }

    @RequestMapping("saveAccount")
    public String saveAccount(Account account){
        System.out.println("saveAccount方法执行了");
        System.out.println(account);
        return "success";
    }

}
