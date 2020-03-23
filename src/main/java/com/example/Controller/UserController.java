package com.example.Controller;

import com.example.Domain.User;
import com.example.Service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {
    @Resource
    private UserServiceImpl userService;
    @RequestMapping("SaveUser")
    public String SaveUser(User user , MultipartFile myFile, HttpServletRequest request){

        return "";
    }
}
