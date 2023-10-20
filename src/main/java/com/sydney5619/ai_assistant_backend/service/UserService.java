package com.sydney5619.ai_assistant_backend.service;

import com.sydney5619.ai_assistant_backend.pojo.User;

import java.util.List;

public interface UserService {
    User userLogin(User user);
    User getUserByUserName(String userName);
    List<User> getAllUsers();
    Integer addUser(User user);
    Integer updateUser(User user);
    Integer deleteUserByUserName(User user);
}
