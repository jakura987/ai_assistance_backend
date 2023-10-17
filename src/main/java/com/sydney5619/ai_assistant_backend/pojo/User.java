package com.sydney5619.ai_assistant_backend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String email;
    private String userName;
    private String firstName;
    private String lastName;
    private String password;
}
