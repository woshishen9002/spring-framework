package com.demo.aop.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description:
 * @author: wanghui
 * @create: 2020-11-26 14:33
 */
@Component
public class LubanInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	//初始化前
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if (beanName.equals("x")) {
			System.out.println("x初始化前");
		} //这里可以提前创建一个对象返回（返回非null），提前结束bean的生命周期
		return null;
	}

	//初始化后
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if (beanName.equals("x")) {
			System.out.println("x初始化后");
		}
		return true;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		return null;
	}

	//BeanPostProcessor的复写
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("x")) {
			System.out.println("x初始化前---");
		}
		//return new Y();
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("x")) {
			System.out.println("x初始化后---");
		}
		return null;
	}
}
