package com.config;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 11:25
 * @tel:18738322951
 */

import com.wsf.model.Car;
import com.wsf.model.Cat;
import com.wsf.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/** 1.
 * 通过@Bean注解的方式指定初始化方法和销毁方法 init-method 和 destroy-method方法
 *
 * 对象的创建：
 *      单实例：在容器启动的时候创建实例
 *      多实例：在使用的时候创建实例
 *
 *BeanPostProcessor.postProcessBeforeInitialization
 *对象的初始化
 * BeanPostProcessor.postProcessAfterInitialization
 *
 * 对象的销毁
 *      单实例：在容器关闭的时候销毁
 *      多实例：只负责bean的创建，不负责对象的销毁
 *
 *
 *
 * 对象的初始化：
 * 1.init 方法和destory-method方法
 *
 * 2.通过让bean实现InitializingBean  和DisposableBean
 *
 * 3.也可以使用JSR250规范的注解来表示
 *          @PostConstruct  :在对象创建完成后进行调用
 *
 *          @PreDestroy：在对象销毁之前完成调用
 *
 * 实现BeanPostProcessor接口（在初始化的前后进行处理）
 *      postProcessBeforeInitialization
 *      postProcessAfterInitialization
 *
 *
 */
@Configuration
public class MainConfig4 {

    @Scope("prototype")
    @Bean(value = "car",initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }


    @Bean(value = "cat")
    public Cat cat(){
        return new Cat();
    }

    @Bean(value = "dog")
    public Dog dog(){
        return new Dog();
    }
}
