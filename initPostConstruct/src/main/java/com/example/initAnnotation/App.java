package com.example.initAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.initAnnotation.bean.BeanInit;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/beans.xml");
		BeanInit init = context.getBean(BeanInit.class);
	}
}
