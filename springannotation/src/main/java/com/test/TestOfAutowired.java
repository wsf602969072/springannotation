package com.test;

import com.config.MainConfigOfAutowired;
import com.wsf.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 3:43
 * @tel:18738322951
 */
@Component
public class TestOfAutowired {


    @Test
    public void test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        UserController controller = context.getBean(UserController.class);
        controller.fun1();
    }
}
