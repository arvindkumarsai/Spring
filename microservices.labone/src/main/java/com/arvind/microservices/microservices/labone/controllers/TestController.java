package com.arvind.microservices.microservices.labone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/Hi/{name}")
	public  String greet(@PathVariable String name) {
		
		
		return "Hi " + name;
	}
	
	@GetMapping("/")
	public String getMapping() {
		
		return "Helo";
	}

}
