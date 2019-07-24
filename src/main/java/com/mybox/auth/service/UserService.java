package com.mybox.auth.service;

import com.mybox.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
