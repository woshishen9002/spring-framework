package com.demo.aop;

import com.demo.aop.init.AppConfig;
import com.demo.aop.service.X;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring-framework
 * @description:
 * @author: wanghui
 * @create: 2020-03-12 16:18
 */
public class AopTest {
	public static void main(String[] args) {
		//第一种写法
		//AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.cl);

		//第二种写法
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();

		X x = ac.getBean(X.class);
		x.getName();
	}
}
