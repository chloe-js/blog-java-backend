package com.blogPosts.userSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


@Entity
public class Emails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto incrementation
    private int id;
    @NotBlank
    @Email
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
