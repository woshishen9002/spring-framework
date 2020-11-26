package com.demo.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: spring
 * @description:
 * @author: wanghui
 * @create: 2020-03-12 16:24
 */
public class Y{

	/*@Autowired
	private X x;*/

	public Y() {
		System.out.println("Y init");
	}

	@Transactional
	public void getName(){
		System.out.println("this is y");
	}

}
