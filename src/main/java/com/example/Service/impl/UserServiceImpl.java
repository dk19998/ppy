package com.example.Service.impl;

import com.example.Domain.User;
import com.example.Mapper.UserMapper;
import com.example.Service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public int SaveUser(User user) {
        return userMapper.SaveUser(user);
    }

    @Override
    public List<User> GetList() {
        return userMapper.GetList();
    }
}
