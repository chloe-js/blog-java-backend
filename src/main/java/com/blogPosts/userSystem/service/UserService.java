package com.blogPosts.userSystem.service;

import com.blogPosts.userSystem.model.User;

import java.util.List;

//write the service and the controller for saving the sata into the database
// getting the data from the database
public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();

    User get(Integer id);

    void save(User user);

    void delete(Integer id);



}
