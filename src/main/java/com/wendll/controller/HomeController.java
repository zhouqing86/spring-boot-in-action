package com.wendll.controller;

import com.wendll.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return helloService.helloWorld();
    }
}
