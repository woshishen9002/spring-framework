package com.demo.aop;

import com.demo.aop.init.AppConfig;
import com.demo.aop.service.MyAdvisor;
import com.demo.aop.service.UserService;
import org.springframework.aop.framework.ProxyFactory;
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
		//AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		//第二种写法
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();
		//ac.refresh(); 由于AnnotationConfigApplicationContext继承自GenericApplicationContext，不支持多次刷新，即不支持多次调用refresh()，否则会报错


		/*X x = (X)ac.getBean("x");
		x.getName();*/

		/*获取操作系统环境*/
		//System.out.println(ac.getEnvironment().getSystemEnvironment());

		//AOP本质就是动态代理
		//ProxyFactory是其中的关键类
		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new UserService());
		factory.addAdvisor(new MyAdvisor());
		UserService userService = (UserService) factory.getProxy();
		userService.test();

	}
}
