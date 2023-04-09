package com.example.springbootlearn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {
    @Value("${school.grade}")
    Integer grade;

    @Value("${school.classnum}")
    Integer classnum;

    static Integer age;

    @Value("${school.age}")
    public  void setAge(Integer age) {
        PropertyController.age = age;
    }

    @GetMapping("/get-para")
    public String getParam(){
        return grade +  "";
    }
}
