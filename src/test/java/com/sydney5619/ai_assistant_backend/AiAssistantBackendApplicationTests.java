package com.sydney5619.ai_assistant_backend;

import com.sydney5619.ai_assistant_backend.mapper.UserMapper;
import com.sydney5619.ai_assistant_backend.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiAssistantBackendApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = userMapper.getUserByUserName("lkl");
        System.out.println(user);
    }

}
