package com.core.integra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class signupcontroller {
	
	@Autowired
	signuprepo repo;
	
	@RequestMapping("home")
	public String signup()
	{
		return "sign.html";
	}
	
	
	@RequestMapping(path="sign", method=RequestMethod.POST)
	public String addition(@ModelAttribute signup s)
	{
		System.out.println(s);
		
		repo.save(s);
		
		//return "redirect:sign.html";
		return "redirect:success.html";
	}
	
	
	@RequestMapping("hi")
	public String hi()
	{
		
		return "demo.jsp";
	}

}
