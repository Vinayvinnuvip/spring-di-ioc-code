package com.jsp.inbuiltobj;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jsp")
public class Mycofig {
@Bean
public EntityManagerFactory create() {
	return Persistence.createEntityManagerFactory("vin");
}
}
