package com.ciara.demo.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class UserController {

    @RequestMapping("/index")
    public String index(){
        return "Hello User";
    }
}
