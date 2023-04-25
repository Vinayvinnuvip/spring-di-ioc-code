package com.jsp.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMusicCar {
public static void main(String[] args) {
	ApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
	Car car=(Car)ac.getBean("car");
	ac.getBean("m");
	car.musicPlayer.play();
	
}
}
