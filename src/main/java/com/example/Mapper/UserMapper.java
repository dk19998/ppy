package com.example.Mapper;

import com.example.Domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("UserMapper")
public interface UserMapper {
    int SaveUser(User user);
    List<User> GetList();
}
