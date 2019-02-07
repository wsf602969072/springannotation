package com.wsf.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 11:54
 * @tel:18738322951
 */
public class Dog {
    public Dog(){
        System.out.println("dog.....constructor.....");
    }

    @PostConstruct
    public void init(){
        System.out.println("dog.....init.....");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("dog.....destroy....");
    }
}
