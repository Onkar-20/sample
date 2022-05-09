package com.core.integra;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class Controller {
	@RequestMapping("index")
	public String hello() {
		System.out.println("Hi");
		return "index.html";
	}
}
