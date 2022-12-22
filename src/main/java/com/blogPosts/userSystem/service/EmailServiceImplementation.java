package com.blogPosts.userSystem.service;

import com.blogPosts.userSystem.model.Emails;
import com.blogPosts.userSystem.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//write the service and the controller for saving the sata into the database in userService and userServiceImpl
@Service // need to have this to define that it is a service class === required a Bean type of service
public class EmailServiceImplementation implements EmailService {
    @Autowired
    private EmailRepository emailRepository;
    @Override
    public Emails saveEmail(Emails email) {
        return emailRepository.save(email);
    }

    @Override
    public List<Emails> getAllEmails() {
        return emailRepository.findAll();
    }

    @Override
    public Emails get(Integer id) {
        return emailRepository.getById(id);
    }

    @Override
    public void save(Emails email) {
        emailRepository.save(email);
    }

    @Override
    public void delete(Integer id) {
        emailRepository.deleteById(id);
    }
}