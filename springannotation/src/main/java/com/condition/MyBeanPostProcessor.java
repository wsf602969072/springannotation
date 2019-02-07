package com.condition;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 1:55
 * @tel:18738322951
 */

/**
 * 后置处理器，在初始化前后进行处理工作
 *
 * spring底层对BeanPostProcessor的使用
 *  @AutoWired,赋值，生命周期的注解，Asnc等注解
 *
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor{
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessBeforeInitialization........"+s);
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessAfterInitialization........."+s);
        return o;
    }
}
