package com.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatherServletConfigInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//The function getServletConfigClasses() configures the dispatcher servlet and transfers the handler to dispatcher servlet java file MVCconfig.class
		return new Class[] {WebApplicationContextConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// getServletMappings() function receive all the requests corresponding to the ‘/ ’ URL mapping
		return new String[] {"/"};
	}

}
