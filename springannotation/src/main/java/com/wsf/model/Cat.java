package com.wsf.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 11:45
 * @tel:18738322951
 */
public class Cat implements InitializingBean,DisposableBean{
    public Cat(){
        System.out.println("cat...constructor");
    }
    public void destroy() throws Exception {
        System.out.println("cat....destroy.....");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("cat....afterPropertiesSet......");
    }
}
