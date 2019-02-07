package com.test;

import com.config.MainConfig2;
import com.wsf.model.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 4:30
 * @tel:18738322951
 */
public class Test3 {

    @Test
    public void test02(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

    }

    @Test
    public void test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        Environment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);

    }
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        System.out.println("ioc容器创建完成");
        Student student1 = (Student) context.getBean("student");
        //Student student2 = (Student) context.getBean("student");
        System.out.println(student1);

    }
}
