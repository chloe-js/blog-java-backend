package com.blogPosts.userSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Emails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto incrementation
    private int id;

    private String email;

    // constructor
    public Emails() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
