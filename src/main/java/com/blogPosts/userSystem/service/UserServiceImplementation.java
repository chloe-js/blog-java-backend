package com.blogPosts.userSystem.service;

import com.blogPosts.userSystem.model.User;
import com.blogPosts.userSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//write the service and the controller for saving the sata into the database in userService and userServiceImpl
@Service // need to have this to define that it is a service class === required a Bean type of service
public class UserServiceImplementation implements UserService {
    @Autowired // Autowire the application
    private UserRepository userRepository;
    @Override // ctrl + "O" === override methods === saveUser
    public User saveUser(User user) {
        return userRepository.save(user);  // method to save user
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll(); // followed up in UserController
        // findAll connects to userRepository which is a JPA Interface === provides the methods to use
    }
    public User get(Integer id){
        return userRepository.findById(id).get();
    }

    public void delete(Integer id) {
        userRepository.deleteById(id);
    }
    public void save(User user) {
        userRepository.save(user);
    }
}
