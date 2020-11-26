package com.demo.create.bean.single.service;

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

	private String name;

	public X() {
		System.out.println("X init");
	}

	@PostConstruct
	public void initPost(){
		System.out.println("X @PostConstruct been init");
	}

	public void getName(){
		System.out.println("this is x--name="+name);
	}

	public void setName(String name) {
		this.name = name;
	}
}
