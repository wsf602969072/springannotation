package com.wsf.service;

import com.wsf.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 11:25
 * @tel:18738322951
 */
@SuppressWarnings("ALL")
@Service
public class UserService {

    @Qualifier(value = "userDao")
    @Autowired
    private UserDao userDao;

    public void fun1(){
        System.out.println(userDao);
    }
}
