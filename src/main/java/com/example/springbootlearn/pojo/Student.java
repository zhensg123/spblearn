package com.example.springbootlearn.pojo;

public class Student {
     String name;
     Integer id;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Id=" + id +
                '}';
    }

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public Student() {
    }
}
