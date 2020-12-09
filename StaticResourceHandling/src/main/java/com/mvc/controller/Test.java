package com.mvc.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	int count = 0;
	
	@Autowired
	ServletContext context ;
	
	@RequestMapping("/welcome")
	public String getPage() {
		return "welcome";
	}
}
