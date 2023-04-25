package com.jsp.inbuiltobj;

import javax.persistence.EntityManagerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEMF {
public static void main(String[] args) {
	ApplicationContext ac = new AnnotationConfigApplicationContext(Mycofig.class);
	EntityManagerFactory emf=(EntityManagerFactory)ac.getBean("create");
	System.out.println(emf);
}
}
