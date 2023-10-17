package com.sydney5619.ai_assistant_backend.controller;

import com.sydney5619.ai_assistant_backend.common.Result;
import com.sydney5619.ai_assistant_backend.pojo.User;
import com.sydney5619.ai_assistant_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/admin/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public Result<User> userLogin(@RequestBody User user){
        try {
            User userLogin = userService.userLogin(user);
            return Result.success(userLogin);
        } catch (Exception e) {
            return Result.error(e.getMessage());
        }
    }

    }

