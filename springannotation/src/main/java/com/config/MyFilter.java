package com.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author: WangShangfei
 * @date: 2019 -下午 1:57
 * @tel:18738322951
 */
public class MyFilter implements TypeFilter {
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
            throws IOException {

        //获取当前类的注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获取当前类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前资源（类的路径）
        Resource resource = metadataReader.getResource();
        String filename = resource.getFilename();
        System.out.println("--------------"+filename);

        return true;
    }
}
