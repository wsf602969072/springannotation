package com.test;

import com.config.MainConfigOfPropertyValue;
import com.wsf.model.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 3:00
 * @tel:18738322951
 */
public class TestOfPropertyValue {

    @Test
    public void test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfPropertyValue.class);
        Person person = (Person) context.getBean("person");
        System.out.println(person);

        Environment environment = context.getEnvironment();
        String property = environment.getProperty("person.nickName");
        System.out.println(property);
    }
}
