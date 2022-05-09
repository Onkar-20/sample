package com.spring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.collection.emp;

public class citest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/ci/ci.xml");
		person p=(person) context.getBean("person");
        System.out.println(p);
	}

}
