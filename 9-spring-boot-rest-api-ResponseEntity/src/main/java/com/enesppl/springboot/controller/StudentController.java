package com.enesppl.springboot.controller;


import com.enesppl.springboot.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


//http://localhost:9090/student
@GetMapping("student")
    public ResponseEntity<Student> getStudent(){


        Student student = new Student(
                1,"Enes","Pepele"


        );
//return new  ResponseEntity<>(student,HttpStatus.OK );


return ResponseEntity.ok().header("custom-header","Enes").body(student);

}


    //http://localhost:9090/students
@GetMapping("students")
public ResponseEntity<List<Student>> getStudents(){
    List<Student> students = new ArrayList<>();
    students.add(new Student(1,"Enes","Pepele"));
    students.add(new Student(2,"Leyla","Sevil"));
    students.add(new Student(3,"Nur","Sabah"));
    students.add(new Student(4,"Merve","Bozok"));
    return  ResponseEntity.ok(students);
}

//Spring BOOT Rest API with Path Variable
//{id}URI Template
// http://localhost:9090/students/1

    @GetMapping("students/{id}/{first-name}/{last-name}")
    public ResponseEntity<Student> studentPathVariable(    @PathVariable("id")         int studentId    ,
                                           @PathVariable(" first-name ") String firstName,
                                           @PathVariable(" last-name ")  String lastName
    ){



   Student student =   new Student(studentId,firstName,lastName);
   return ResponseEntity.ok(student);



}

//Spring BOOT REST API with Request Param
// http://localhost:9090/students/query?id=1
// http://localhost:9090/students/query?id=1&firstName=Enes&lastName=Pepele


@GetMapping("students/query")
public ResponseEntity<Student> studentRequestVariable(
        @RequestParam int id,
        @RequestParam String firstName,
        @RequestParam String lastName





){



    Student student = new Student(id,firstName,lastName);
return ResponseEntity.ok(student);


}







@PostMapping("students/create")
//@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstNmae());
        System.out.println(student.getLastName());
    return new ResponseEntity<>(student,HttpStatus.CREATED);
}

//Spring Boot REST API that handles HTTP Put Request - updating existing resource



    @PutMapping("students/{id}/update")
    public ResponseEntity<Student>updateStudent(@RequestBody Student student,@PathVariable("id") int studentId){

        System.out.println(student.getFirstNmae());
        System.out.println(student.getLastName());
        return ResponseEntity.ok(student);

    }





    //Spring boot REST API that handles http delete request- deleting existing resource

    @DeleteMapping("students/{id}/delete")
    public ResponseEntity<String>   deleteStudent(@PathVariable("id") int studentId){
        System.out.println(studentId);
    return ResponseEntity.ok("Student deleted successfully !!!");


    }













}
