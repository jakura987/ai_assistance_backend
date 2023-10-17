package com.sydney5619.ai_assistant_backend.service.Impl;

import com.sydney5619.ai_assistant_backend.exception.BusinessException;
import com.sydney5619.ai_assistant_backend.mapper.UserMapper;
import com.sydney5619.ai_assistant_backend.pojo.User;
import com.sydney5619.ai_assistant_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User userLogin(User user) {
        User userFromDb = userMapper.getUserByUserName(user.getUserName());

        // Check if user exists in the database
        if (userFromDb == null) {
            throw new BusinessException("User does not exist");
        }

        if (user.getPassword().equals(userFromDb.getPassword())) {
            return userFromDb;
        }

        throw new BusinessException("Password is incorrect");
    }
}
