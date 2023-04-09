package com.example.springbootlearn.controller;

import com.example.springbootlearn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 鎻忚堪锛?    瀛︾敓Controller
 */
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/student")
    public String requestPara(@RequestParam Integer id) {
        System.out.println(studentService.getStudent(id));

        return studentService.getStudent(id).toString();
    }
}
