package com.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 5:33
 * @tel:18738322951
 */

public class MyImportSelector implements ImportSelector{
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.wsf.model.Black","com.wsf.model.Yello"};
    }
}
