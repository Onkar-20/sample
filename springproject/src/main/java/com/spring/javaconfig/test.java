package com.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.javaconfig.student;

public class test {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(config.class);
    	student s= context.getBean("getstudent",student.class);
        System.out.println(s);
        s.study();
	}

	}


