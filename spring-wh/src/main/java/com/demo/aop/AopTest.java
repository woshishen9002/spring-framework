package com.demo.aop;

import com.demo.aop.init.AppConfig;
import com.demo.aop.service.X;
import org.springframework.beans.SimpleTypeConverter;
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
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		//第二种写法
		/*AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();*/


		X x = ac.getBean(X.class);
		x.getName();

		/*获取操作系统环境*/
		//System.out.println(ac.getEnvironment().getSystemEnvironment());



	}
}
