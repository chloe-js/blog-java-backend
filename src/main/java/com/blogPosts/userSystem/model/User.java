package com.blogPosts.userSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id //make it the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto incrementation
    private int id;
    private String name;
    private String review;

    //create the contractor === ctrl + enter ===select none
    public User() {
    }

    //create the getter and setter === ctrl + enter ===select ALL
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
