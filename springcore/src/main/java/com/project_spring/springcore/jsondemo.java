package com.project_spring.springcore;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class jsondemo {

	public static void main(String[] args) {
		
	try {	
		

	ObjectMapper o=new ObjectMapper();
	emp e=new emp (
			
			         "onkar",
			         "solapur",
			         "cse",
			         "project manager"
			
			
			      );
			      
	    o.writeValue(new File ("target/employee.json"), e);
	    System.out.println("done");
	
	  }
	catch(final Exception e)
	{
		e.printStackTrace();
	}
	
	}

}
