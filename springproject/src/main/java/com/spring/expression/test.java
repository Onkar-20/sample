package com.spring.expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.collection.emp;

public class test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/expression/exp.xml");
		demo d= context.getBean("Demo",demo.class);
        System.out.println(d);

	}
 
}
