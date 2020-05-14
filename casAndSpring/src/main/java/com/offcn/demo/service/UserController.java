package com.offcn.demo.service;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/findLoginUser")
    public void getUserName(){
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        System.out.println(username);
    }
}
