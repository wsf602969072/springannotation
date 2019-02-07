package com.test;

import com.config.MainConfig;
import com.wsf.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 10:20
 * @tel:18738322951
 */
public class MainTest {
    public static void main(String[] args) {
        /*ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);*/

        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        //Person bean = context.getBean(Person.class);

        String[] beanNamesForType = context.getBeanNamesForType(Person.class);
        for (String name:beanNamesForType) {
            System.out.println(name);
        }
        //System.out.println(bean);
    }
}
