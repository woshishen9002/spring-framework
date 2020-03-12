package com.demo.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

	public Y() {
		System.out.println("Y init");
	}

	public void getName(){
		System.out.println("this is y");
	}

}
