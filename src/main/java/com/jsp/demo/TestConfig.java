package com.jsp.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {
public static void main(String[] args) {
	ApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
	First first=(First)ac.getBean("first");
	first.test();
}
}
