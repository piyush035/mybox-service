package com.mybox.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybox.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
