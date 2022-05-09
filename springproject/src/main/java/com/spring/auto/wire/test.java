package com.spring.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springproject.student;

public class test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/auto/wire/autoconfig.xml");
    	emp e=(emp) context.getBean("emp1",emp.class);
        System.out.println(e);
	}

}
