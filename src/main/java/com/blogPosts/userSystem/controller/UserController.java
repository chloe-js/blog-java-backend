package com.blogPosts.userSystem.controller;

import com.blogPosts.userSystem.model.User;
import com.blogPosts.userSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //this will allow response body and controller at the same time
@RequestMapping("/user") // use to create the path
@CrossOrigin //this will tell springboot application to connect to other applications// CORS will block communication between local hosts === UserController in Java
public class UserController {
    // what we want injected into the service
    @Autowired
    private UserService userService;

    @PostMapping("/add") // this will save the data into the database
    public User add(@RequestBody User user) {

        return userService.saveUser(user); // message passed to postman with 200 pass
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return userService.getAllUsers(); // return a list of all users
    }
}
