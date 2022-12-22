package com.blogPosts.userSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Emails {
    @Id // make it the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incrementation
    private int id;

    private String email;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // create the contractor === ctrl + enter ===select none
    public Emails() {
    }
}
// create the getter and setter === ctrl + enter ===select ALL