package com.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Controller
@EnableWebMvc
@ComponentScan({"com.mvc.controller"})
public class WebApplicationContextConfig extends WebMvcConfigurerAdapter	{

	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setPrefix("/WEB-INF/pages/");
		irvr.setSuffix(".jsp");
		return irvr;
	}
}
