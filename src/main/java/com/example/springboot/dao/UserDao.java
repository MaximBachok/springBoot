package com.example.springboot.dao;

import com.example.springboot.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {

    void saveUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    User getUser(long id);

    void updateUser(User user);
}
