package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Welcome {
	@RequestMapping(method=RequestMethod.GET , value="/welcome" )
	public String sayMessage() {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<called>>>>>>>>>>>>>>>>>>>>>");
		return "welcome";
	}
}
