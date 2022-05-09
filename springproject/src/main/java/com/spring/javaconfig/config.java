package com.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.spring.javaconfig")
public class config {
	@Bean
	public student getstudent()
	{
		
		student s=new student();
		return s;
	}

}
