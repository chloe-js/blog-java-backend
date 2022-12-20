package com.blogPosts.userSystem.controller;

import com.blogPosts.userSystem.model.User;
import com.blogPosts.userSystem.service.UserService;
import com.blogPosts.userSystem.service.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController //this will allow response body and controller at the same time
@RequestMapping("/user") // use to create the path
@CrossOrigin //this will tell springboot application to connect to other applications// CORS will block communication between local hosts === UserController in Java
public class UserController {
    // what we want injected into the service
    @Autowired
    private UserService userService;

    @PostMapping("/add") // this will save the data into the database
    public String add(@RequestBody User user) {
        userService.saveUser(user);
        return "New user review is added"; // message passed to postman with 200 pass
    }
//    @PostMapping("/add") // this will save the data AND UPDATE but it doesnt work with string so trying user into the database
//    public User add(@RequestBody User user) {
//        return userService.saveUser(user);
//    }

    @GetMapping("/getAll")
    public List<User> getAllUsers(){

        return userService.getAllUsers(); // return a list of all users
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> get(@PathVariable Integer id) {
        try {
            User user = userService.get(id);
            return new ResponseEntity<User>(user, HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@RequestBody User user, @PathVariable Integer id) {
        try {
            User existingUser = userService.get(id);
            userService.save(user);
            return new ResponseEntity<>(HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        userService.delete(id);
        return "Delete Student with id " + id;
    }
}
