package com.blogPosts.userSystem.service;

import com.blogPosts.userSystem.model.Emails;

import java.util.List;

//write the service and the controller for saving the sata into the database
// getting the data from the database
public interface EmailService {
    public Emails saveEmail(Emails email);
    public List<Emails> getAllEmails();

    Emails get(Integer id);

    void save(Emails email);

    void delete(Integer id);



}