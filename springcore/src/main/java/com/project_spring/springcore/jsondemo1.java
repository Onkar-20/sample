package com.project_spring.springcore;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsondemo1 {

	public static void main(String[] args) {
		try {
		String jsonstring="{\"name\":\"onkar\",\"city\":\"solapur\",\"department\":\"cse\",\"designation\":\"project manager\"}";
		
		ObjectMapper om=new ObjectMapper();

			student e=om.readValue(jsonstring,student.class);
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}

	}

}
