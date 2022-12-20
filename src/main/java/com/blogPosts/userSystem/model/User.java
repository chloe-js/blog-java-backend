package com.blogPosts.userSystem.model;

import jakarta.persistence.*;

import java.util.Date;
//import java.util.Date;

@Entity
public class User {
    @Id //make it the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto incrementation
    private int id;

    private String title;
    private String name;
    @Column(length = 1000)/// may or may not help with character length
    private String review;
    private String imageSrc;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date LastUpdate;

    @PrePersist
    private void onCreate() {
        LastUpdate = new Date();
    }

    public Date getLastUpdate() {
        return LastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        LastUpdate = lastUpdate;
    }
//    @Column(name = "CREATED_DATE")
//    LocalDate date;
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(nullable = false)
//    private Date LastUpdate;
//
//    @PrePersist
//    private void onCreate() {
//        LastUpdate = new Date();
//    }

    //create the contractor === ctrl + enter ===select none
    public User() {
    }

    //create the getter and setter === ctrl + enter ===select ALL
    public int getId() {
        return id;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public String getTitle() {
        return title;
    }

//    public Date getLastUpdate() {
//        return LastUpdate;
//    }
//
//    public void setLastUpdate(Date lastUpdate) {
//        LastUpdate = lastUpdate;
//    }

    public void setTitle(String title) {
        this.title = title;
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