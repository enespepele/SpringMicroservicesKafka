package com.enesppl.springbootrestfulwebservices.controller;


import com.enesppl.springbootrestfulwebservices.entity.User;
import com.enesppl.springbootrestfulwebservices.service.UserService;
import lombok.AllArgsConstructor;
import org.apache.el.stream.StreamELResolverImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {

private UserService userService;

//build create User REST-API

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){

    User savedUser = userService.createUser(user);
    return new ResponseEntity<>(savedUser, HttpStatus.CREATED);

}

//build get user by id REST API
    //htttp://localhost:9090/api/users/id
    @GetMapping("{userId}")
        public ResponseEntity<User> getUserById(@PathVariable Long userId){

        User user = userService.getUserById(userId);
        return new ResponseEntity<>(user , HttpStatus.OK);

        }


        // Build get all users REST API
        //htttp://localhost:9090/api/users
    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){


            List<User> users = userService.getAllUsers();
            return new ResponseEntity<>(users,HttpStatus.OK);

    }

    //Build Update user REST API
    //htttp://localhost:9090/api/users/id
    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Long userId,
                                           @RequestBody User user){
        user.setId(userId);

        User updateUser = userService.updateUser(user);
        return new ResponseEntity<>(updateUser,HttpStatus.OK);
    }
//build delete User REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){

        userService.deleteUser(userId);
        return new ResponseEntity<>("User Successfully deleted",HttpStatus.OK);

    }








}
