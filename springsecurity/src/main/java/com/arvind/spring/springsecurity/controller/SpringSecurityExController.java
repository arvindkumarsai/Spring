package com.arvind.spring.springsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityExController {

	
	@RequestMapping("/") 
	public String getbaseuri() {
		return "baseURI";
	}
	
	@RequestMapping("/test") 
	public String getTestUri() {
		return "testURI";
	}
	
	@RequestMapping("/securitytest") 
	public String getsecurityTestUri() {
		return "securitytestURI";
	}
	
	
}
