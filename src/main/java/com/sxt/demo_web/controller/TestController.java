package com.sxt.demo_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("Test方法被执行了...");
        System.out.println("测试dev的代码");
        return "hello";
    }
}
