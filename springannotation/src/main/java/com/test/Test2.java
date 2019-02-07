package com.test;

import com.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 11:27
 * @tel:18738322951
 */
public class Test2 {

    @Test
    public void test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
