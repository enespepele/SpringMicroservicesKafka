package com.enesppl.springboot.controller;


import com.enesppl.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
    //http://localhost:9090/students
@GetMapping("students")
public List<Student> getStudents(){

    List<Student> students = new ArrayList<>();
    students.add(new Student(1,"Enes","Pepele"));
    students.add(new Student(2,"Leyla","Sevil"));
    students.add(new Student(3,"Nur","Sabah"));

    students.add(new Student(4,"Merve","Bozok"));

    return students;




}

//Spring BOOT Rest API with Path Variable
//{id}URI Template
// http://localhost:9090/students/1

    @GetMapping("students/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(
                                           @PathVariable("id")         int studentId    ,
                                           @PathVariable(" first-name ") String firstName,
                                           @PathVariable(" last-name ")  String lastName

    ){


    return  new Student(studentId,firstName,lastName);





    }







}
