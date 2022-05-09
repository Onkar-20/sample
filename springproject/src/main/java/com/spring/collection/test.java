package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springproject.student;

public class test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/collection/collection.xml");
		emp e=(emp) context.getBean("emp1");
        System.out.println(e);
	}

}
