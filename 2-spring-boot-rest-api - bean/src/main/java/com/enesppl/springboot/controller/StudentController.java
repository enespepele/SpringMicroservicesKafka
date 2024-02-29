package com.enesppl.springboot.controller;


import com.enesppl.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


//http://localhost:9090/student
@GetMapping("student")
    public Student getStudent(){


        Student student = new Student(
                1,"Enes","Pepele"


        );

return student;


    }









}
