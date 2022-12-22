package com.blogPosts.userSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Persister;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
public class User {
    @Id //make it the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto incrementation
    private int id;
@NotBlank
    private String title;
    private String name;
    @Column(length = 1000)/// may or may not help with character length
    private String review;
    private String imageSrc;

    //create the contractor === ctrl + enter ===select none
    public User() {
    }
//    @Email //needs @ in the string
//    private String email;
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updateAt;

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

// CHANGED
//    @Temporal(TemporalType.TIMESTAMP)
////    @Column(nullable = false)
//    private Date LastUpdate;
//
//    @PrePersist
//    public void onCreate() {
//        LastUpdate = new Date();
//    }
//
//    public Date getLastUpdate() {
//        return LastUpdate;
//    }
//
//    public void setLastUpdate(Date lastUpdate) {
//        LastUpdate = lastUpdate;
//    }

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