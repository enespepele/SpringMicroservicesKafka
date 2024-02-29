package com.enesppl.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

// HTTP get Request
//http://localhost:9090/hello-Malatya
// http://localhost:9090/calculate

@GetMapping("/hello-Malatya")
public String helloMalatya(){

    return "Hello Malatya";

}


@GetMapping("calculate")
    public int calculate(){

        int x = 5 ;
        return  x+3;



}






}
