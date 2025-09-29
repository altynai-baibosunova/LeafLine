package com.growthhungry.demo.service;

import com.growthhungry.demo.model.User;
import java.util.List;

public interface UserService {

    User registerUser(User user);  // for registration with hashing

    List<User> getAllUsers();      // to list users

    User saveUser(User user);      // optional, if needed
}
