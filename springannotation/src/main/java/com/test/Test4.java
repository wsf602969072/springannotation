package com.test;

import com.config.MainConfig3;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 5:37
 * @tel:18738322951
 */
public class Test4 {

    @Test
    public void test02(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig3.class);
        Object colorFactoryBean = context.getBean("colorFactoryBean");
        Object colorFactoryBean1 = context.getBean("colorFactoryBean");
        System.out.println(colorFactoryBean.getClass());
        System.out.println(colorFactoryBean1.getClass());
        System.out.println(colorFactoryBean == colorFactoryBean1);

        //获取工厂这个对象  在id的前面加上&
        Object bean = context.getBean("&colorFactoryBean");
        System.out.println(bean.getClass());
    }

    @Test
    public void test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig3.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

    }
}
