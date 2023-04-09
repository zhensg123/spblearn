package com.example.springbootlearn.controller;

import com.example.springbootlearn.pojo.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class ParaController {
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }


    @GetMapping("/para")
    public String para(@RequestParam Integer num){
        num = num + 1;
        return "hello world" + num;
    }

    @PostMapping("/post")
    public String post(@RequestBody Student student){
        return "hello world" + student;
    }


}
