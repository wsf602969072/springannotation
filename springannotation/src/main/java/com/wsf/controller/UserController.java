package com.wsf.controller;

import com.wsf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 11:24
 * @tel:18738322951
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void fun1(){
        System.out.println(userService);
        userService.fun1();
    }
}
