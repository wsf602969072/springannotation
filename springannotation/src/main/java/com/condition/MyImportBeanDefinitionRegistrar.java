package com.condition;

import com.wsf.model.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 6:28
 * @tel:18738322951
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean b1 = registry.containsBeanDefinition("com.wsf.model.Color");
        boolean b2 = registry.containsBeanDefinition("com.wsf.model.Red");
        if(b1 && b2){
            //定义bean的信息
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(RainBow.class);
            //指定bean的名称。进行注册
            registry.registerBeanDefinition("rainBow",rootBeanDefinition);
        }
    }
}
