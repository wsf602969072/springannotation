package com.factory;

import com.wsf.model.Color;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 7:02
 * @tel:18738322951
 */
public class ColorFactoryBean implements FactoryBean<Color>{
    //返回对象
    public Color getObject() throws Exception {
        return new Color();
    }

    //返回对象的类型
    public Class<?> getObjectType() {
        return Color.class;
    }

    //是否是单例的  true:单例  false:多例
    public boolean isSingleton() {
        return true;
    }
}
