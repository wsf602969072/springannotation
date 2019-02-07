package com.config;

import com.condition.LinuxCondition;
import com.condition.WindowsCondition;
import com.wsf.model.Color;
import com.wsf.model.Red;
import com.wsf.model.Student;
import org.springframework.context.annotation.*;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 4:26
 * @tel:18738322951
 */
/*
        ConfigurableBeanFactory#SCOPE_PROTOTYPE  prototype
	 * @see ConfigurableBeanFactory#SCOPE_SINGLETON singleton
	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST request
	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION session
 */
@Configuration
@Import(value = {Color.class, Red.class})
public class MainConfig2 {

   // @Scope("prototype")
    @Lazy//是在单实例的情况下才有懒加载
    @Bean(value = "student")
    public Student student(){
        System.out.println("创建Student对象");
        return new Student(1,"小明");
    }

    @Conditional(value = {WindowsCondition.class})//需要创建Condition的类，这个类实现了Condition的类
    @Bean(value = "bill")
    public Student student02(){
        System.out.println("创建Student对象");
        return new Student(2,"bill gates");
    }

    @Conditional(value = {LinuxCondition.class})//需要创建Condition的类，这个类实现了Condition的类
    @Bean(value = "linus")
    public Student student03(){
        System.out.println("创建Student对象");
        return new Student(3,"linus");
    }
}
