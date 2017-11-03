package com.cxxy.study.web.controller;

import com.cxxy.com.cxxy.study.model.UserInfo;
import com.cxxy.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login() {

        UserInfo user = new UserInfo();
        user.setUserName("test1");
        user.setPassword("123456");

        try {
            userService.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "user/login";
    }
}
