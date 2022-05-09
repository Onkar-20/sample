package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.standalone.collection.person;

public class test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/stereotype/stereo.xml");
    	student s=(student) context.getBean("ob",student.class);
        System.out.println(s);
	}

}
