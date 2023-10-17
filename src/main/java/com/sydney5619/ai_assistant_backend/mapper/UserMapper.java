package com.sydney5619.ai_assistant_backend.mapper;

import com.sydney5619.ai_assistant_backend.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where user_name = #{userName}")
    User getUserByUserName(String userName);
}
