package com.config;

import com.wsf.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 3:39
 * @tel:18738322951
 */

/**
 * 1.自动注入：
 *        @Autowired
 *           1.默认是按照类型去容器中找对应的组件，applicationContext.getBean("");
 *           2.如果容器中有多个相同类型的组件的话，那么就会根据属性名称和容器中id进行匹配查找
 *           3.@Qualifier可以明确定义要装配的组件id,而不是使用类型进行装配
 *           4.如果这个对象不是必须的，可以在@Autowired的注解上加上required
 *           5.@primary注解可以让spring自动装配的时候，让bean作为首选bean,如果加上@Qualifier那么这个注解也将不再起作用
 *
 * 2.Spring还支持使用@Resource 和@Inject
 *          @Resource:
 *              可以和@Autowired一样实现自动装配的功能，默认是按组件的名称自动装配
 *              不支持@Primary和required=false的功能
 *          @Inject
 *              需要导入javax.inject的包，也不支持required=false的功能
 *
 * 3.@Autowired:构造器，方法，参数，属性
 *          1.标注在方法上：@Bean+方法参数，参数从容器中获取
 *          2.标注在构造器上：如果组件只有一个有参构造器，这个有参构造器的@Autowired可以省略
 *
 * 4.自定义组件想要使用Spring容器底层的一些组件（ApplicationContext,BeanFactory,XXx）
 *     自定义组件实现XXXAware，在创建对象的时候，会调用接口规定的方法注入相关的组件Aware
 *     把Spring底层一些组件注入到自定义的bean中
 */

@ComponentScan(value = {"com.wsf.controller","com.wsf.service","com.wsf.dao"})
@Configuration
public class MainConfigOfAutowired {


    @Primary
    @Bean("userDao2")
    public UserDao userDao(){
        UserDao userDao = new UserDao();
        userDao.label="2";
        return userDao;
    }
}
