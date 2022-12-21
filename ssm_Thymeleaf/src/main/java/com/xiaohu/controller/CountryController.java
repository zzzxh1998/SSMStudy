package com.xiaohu.controller;

import com.xiaohu.pojo.Country;
import com.xiaohu.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class CountryController {

    @Autowired
    @Qualifier("countryServiceImpl")
    private CountryService countryService;

    @RequestMapping("/hello")
    public String getAllTest(Model model){
        Country country = countryService.getById(1);
        System.out.println(country);
        model.addAttribute("msg",country);
        return "hello";
    }


}
