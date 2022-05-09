package com.spring.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springproject.student;

public class test1 {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/autowire/annotation/autoannotation.xml");
    	emp1 e=(emp1) context.getBean("emp1",emp1.class);
        System.out.println(e);
	}

}
