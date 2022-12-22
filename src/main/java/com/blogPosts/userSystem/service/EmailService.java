package com.blogPosts.userSystem.service;

import com.blogPosts.userSystem.model.Emails;

import java.util.List;

//write the service and the controller for saving the sata into the database
// getting the data from the database
public interface EmailService {
    public Emails saveUser(Emails email);
    public List<Emails> getAllUsers();

    Emails get(Integer id);

    void save(Emails email);

}
