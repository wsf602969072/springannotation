package com.config;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 5:09
 * @tel:18738322951
 */

import com.condition.MyImportBeanDefinitionRegistrar;
import com.condition.MyImportSelector;
import com.factory.ColorFactoryBean;
import com.wsf.model.Color;
import com.wsf.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 给容器中注册组件：
 * 1.包扫描+组件标注注解（@Controller、@Service、@Repository、@Component）
 * 2.@Bean[导入的第三方包里面的组件]
 * 3.@Import[快速给容器导入一个组件]
 *          1）@Import(要导入到容器中的组件),自动注册到容器中,id为默认的全类名
 *          2)使用ImportSelector进行导入，实现ImportSelector借口，返回的数组是要导入类的包名加类名
 *          3）使用ImportBeanDefinitionRegistrar来手动注册类
 * 4.使用Spring提供的FactoryBean
 *          1)默认得到的工厂bean是通过getObject()创建出来的对象
 *          2）要获得bean工厂本身，就需要在id前面加上&  &colorFactoryBean
 */
@Configuration
@Import(value={Color.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})

public class MainConfig3 {
    @Bean
    public Student student(){
        return new Student();
    }

    @Bean("colorFactoryBean")
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }

}
