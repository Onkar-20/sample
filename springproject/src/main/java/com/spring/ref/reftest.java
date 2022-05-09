package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.collection.emp;

public class reftest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/ref/ref.xml");
		A a=(A) context.getBean("aref");
        System.out.println(a);
	}

}
