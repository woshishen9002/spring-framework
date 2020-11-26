package com.demo.aop.service;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class LubanMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {

    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
        if (beanName.equals("x")) {
			System.out.println("x BeanDefinition的后置处理");
            beanDefinition.setBeanClass(X.class); // 没用
            beanDefinition.getPropertyValues().add("name","xxx");
        }
    }
}