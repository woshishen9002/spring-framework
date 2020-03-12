package com.demo.aop.service;

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
public class X {

	@Autowired
	private Y y;

	@PostConstruct
	public void initPost(){
		System.out.println("X @PostConstruct been init");
	}

	public X() {
		System.out.println("X init");
	}

	public void getName(){
		System.out.println("this is x");
	}

}
