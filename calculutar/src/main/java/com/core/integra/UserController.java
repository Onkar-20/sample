package com.core.integra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@Autowired
	Userrepo repo;
	
	@RequestMapping("/")
	public String first()
	{
		return "index.html";
	}
	
	@RequestMapping("/login")
	public String Login()
	{
		return "login.html";
	}
	
	@RequestMapping("/calci")
	public String calci()
	{
		return "cal.html";
	}
	
	@RequestMapping(path="/add", method=RequestMethod.POST)
	public String addition(@ModelAttribute calmodel c)
	{
		System.out.println(c);
		
		repo.save(c);
		return "redirect:/calci";
	}
	

}
