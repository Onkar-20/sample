package com.spring.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springproject.student;

public class test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/standalone/collection/aloneconfig.xml");
    	person p=(person) context.getBean("person1",person.class);
        System.out.println(p);
        System.out.println(p.getFriends().getClass().getName());
        
        
     
        
       
        
        
        
	}

}
