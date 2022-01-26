package com.example.springboot.service;

import com.example.springboot.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    User getUser(long id);

    void updateUser(User user);
}
