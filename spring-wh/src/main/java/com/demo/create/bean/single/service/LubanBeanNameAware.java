package com.demo.create.bean.single.service;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description: 通过实现该接口，可以设置LubanBeanNameAware组件的beanName
 * 					默认lubanBeanNameAware
 * @author: wanghui
 * @create: 2020-11-26 15:02
 */
@Component
public class LubanBeanNameAware implements BeanNameAware {
	@Override
	public void setBeanName(String name) {
		//name = "xxx";
		System.out.println("x LubanBeanNameAware");
	}
}
