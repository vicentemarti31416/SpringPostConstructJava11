package com.example.initAnnotation.bean;

import javax.annotation.PostConstruct;

public class BeanInit {

	@PostConstruct
	public void initMethod() {
		System.out.println("Inith method");
	}
}
