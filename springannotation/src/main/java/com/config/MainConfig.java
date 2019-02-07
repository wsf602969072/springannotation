package com.config;

import com.wsf.model.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 10:36
 * @tel:18738322951
 */

//这是一个配置类==配置文件  需要加上@Configuration这个注解
@Configuration
@Component
@ComponentScans(value = {
        @ComponentScan(value = "com.wsf",includeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
                //指定哪一种需要加入容器中
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {UserService.class}),
                //通过正则表达式进行匹配
//                @ComponentScan.Filter(type = FilterType.REGEX,pattern = "com.wsf.*"),
                //如果这个类已经扫描进去，那么这个类不再通过这个过滤器了
                @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyFilter.class})
        },useDefaultFilters = false)
})

//excludeFilters不包含哪些类
//includeFilters包含哪些类  如果想要只包含就useDefaultFilters = false,不使用默认的过滤器
//filter[]  这是一种过滤器
//          Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),根据注解进行扫描
//          Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {UserService.class})根据指定的类型进行扫描
//          Filter(type = FilterType.REGEX,pattern = "com.wsf.*")根据正则表达式进行判断
public class MainConfig {

    //原来的bean标签  类型是返回值类型  id默认是方法的名称
    @Bean(value = "person")
    public Person person(){
        return new Person("zhangsan",33);
    }
}
