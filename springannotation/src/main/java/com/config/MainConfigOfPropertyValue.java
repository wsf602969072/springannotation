package com.config;

import com.wsf.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 2:59
 * @tel:18738322951
 */
@PropertySource(value = {"classpath:prop.properties"})
//加入外部的属性文件  相当于<context:property-placeholder location="classpath:prop.properties" />
@Configuration
public class MainConfigOfPropertyValue {

    @Bean
    public Person person(){
        return new Person();
    }
}
