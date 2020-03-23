package com.example.Service;

import com.example.Domain.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    int SaveUser(User user);
    List<User> GetList();
}
