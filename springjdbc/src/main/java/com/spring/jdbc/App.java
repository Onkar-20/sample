package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;





/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	JdbcTemplate s=context.getBean("jdbc",JdbcTemplate.class);
    	
    	String query= " insert into stud (id,name,city) values (?,?,?)";
    	int result= s.update(query,12,"abc","solapur");
    	
       System.out.println("number of record inserted..."+result);
    	
   
    	
	}
    }

