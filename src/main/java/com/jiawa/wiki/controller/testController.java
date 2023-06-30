package com.jiawa.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    // RequestMapping既可以是post也可以是get
    // http有8种请求
    @Value("${test.hello:TEST}")
    private  String hello;
    @GetMapping("/test")
    public  String Test(){
        return "hello world" + hello;
    }
}
