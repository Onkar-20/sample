package com.spring.springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
    	student s=(student) context.getBean("student1");
        System.out.println(s);
        
        student s1=(student) context.getBean("student2");
        System.out.println(s1);
        
        student s2=(student) context.getBean("student3");
        System.out.println(s2);
        
    }
}
