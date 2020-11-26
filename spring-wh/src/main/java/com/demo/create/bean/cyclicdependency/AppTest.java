package com.demo.create.bean.cyclicdependency;

import com.demo.aop.init.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring-framework
 * @description: 循环依赖
 * @author: wanghui
 * @create: 2020-03-12 16:18
 */
public class AppTest {
	public static void main(String[] args) {
		//第一种写法
		//AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		//第二种写法
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();
		//ac.refresh(); 由于AnnotationConfigApplicationContext继承自GenericApplicationContext，不支持多次刷新，即不支持多次调用refresh()，否则会报错

		/*X x = (X)ac.getBean("x");
		x.getName();*/
	}
}
