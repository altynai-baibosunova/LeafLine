package com.growthhungry.demo.service;

import com.growthhungry.demo.model.User;
import java.util.List;


public interface UserService {
    User registerUser(User user);

    List<User> getAllUsers();

    User saveUser(User user);
}

