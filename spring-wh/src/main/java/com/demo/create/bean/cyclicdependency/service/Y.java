package com.demo.create.bean.cyclicdependency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @program: spring
 * @description:
 * @author: wanghui
 * @create: 2020-03-12 16:24
 */
@Component
public class Y {

	@Autowired
	private X x;

	public void getName(){
		System.out.println("this is y getName. x="+x);
	}
}
