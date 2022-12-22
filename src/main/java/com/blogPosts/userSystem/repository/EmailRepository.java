package com.blogPosts.userSystem.repository;

import com.blogPosts.userSystem.model.Emails;
import com.blogPosts.userSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // JpaRepost requires the model class and the integer (Id passes in as the primary key)
public interface EmailRepository extends JpaRepository<Emails, Integer> {
}

