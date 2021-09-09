package com.ciara.demo.user.controller;

import com.ciara.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/index")
    public String index(){
        return "Hello JAVA！";
    }
}
