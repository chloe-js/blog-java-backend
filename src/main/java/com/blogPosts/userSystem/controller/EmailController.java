package com.blogPosts.userSystem.controller;

import com.blogPosts.userSystem.model.Emails;
import com.blogPosts.userSystem.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
@RestController
@RequestMapping("/email")
@CrossOrigin

public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/add") // this will save the data into the database
    public String add(@RequestBody Emails email) {
        emailService.saveEmail(email);
        return "New user review is added"; // message passed to postman with 200 pass
    }

    @GetMapping("/getAll")
    public List<Emails> getAllEmails() {

        return emailService.getAllEmails(); // return a list of all users
    }

    @GetMapping("/{id}")
    public ResponseEntity<Emails> get(@PathVariable Integer id) {
        try {
            Emails email = emailService.get(id);
            return new ResponseEntity<Emails>(email, HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<Emails>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Emails> update(@RequestBody Emails email, @PathVariable Integer id) {
        try {
            Emails existingEmail = emailService.get(id);
            existingEmail.setEmail(email.getEmail());
            // existingUser.setLastUpdate(user.getLastUpdate());
            // User asd = emailServiceImplementation.get(id);
            // System.out.println(id);
            // System.out.println(existingUser);
            emailService.save(existingEmail);
            // emailService.saveUser(user);
            return new ResponseEntity<>(HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<Emails>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        emailService.delete(id);
        return "Delete Student with id " + id;
    }
}