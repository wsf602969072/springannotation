package com.test;

import com.config.MainConfig4;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 11:31
 * @tel:18738322951
 */

public class Test5 {

    @Test
    public void test04(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig4.class);
        System.out.println("容器创建完成");
        Object dog = context.getBean("cat");
        System.out.println("-----------");

    }
    @Test
    public void test03(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig4.class);
        System.out.println("容器创建完成");
        Object dog = context.getBean("dog");
        context.close();
    }

    @Test
    public void test02(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig4.class);
        System.out.println("容器创建完成");
        Object car = context.getBean("cat");
        context.close();
    }

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig4.class);
        System.out.println("容器创建完成");
        Object car = context.getBean("car");
        context.close();
    }
}
