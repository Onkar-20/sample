package com.spring.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.dao.entity.student;
import com.spring.dao.jdbc.old.studentdao;





/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/dao/config.xml");
    	
    	ApplicationContext context= new AnnotationConfigApplicationContext(jdbcconfig.class);
    	studentdao sd=context.getBean("studentdao",studentdao.class);
    
    //         ******** Insert Query **********	
    	
   //	student s1=new student();
   // 	s1.setId(50);
   // 	s1.setName("ajay");
   // 	s1.setCity("solapur");
    	
   // int result=	sd.insert(s1);
   // System.out.println("student added"+result); 
    	
    	
   //  *********      Update Query 	*************
     	
   // student s2=new student();
  //  s2.setId(12);
  //  s2.setName("vasant");
  //  s2.setCity("pune");
    	
    	
 // int result = sd.change(s2);
 // System.out.println("student change"+result);
      
  
    	
  //    ***********  Delete Query ********
   
    //	int result=sd.delete(40);
    //	System.out.println("student deleted"+result);
    	
    	
    	
   // Selecting single student
    	
// student s=  sd.getstudent(2);
// System.out.println("show student"+s);
    	
   
   // Selecting multiple students
    	
   List<student> students =sd.getallstudents();
   for(student s:students)
   {
	   System.out.println(s);
   }
   
    	
	}
    }

