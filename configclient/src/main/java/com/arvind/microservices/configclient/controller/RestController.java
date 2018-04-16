package com.arvind.microservices.configclient.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@PostConstruct
	public void show() {
		
		System.out.println("in post");
	}

	  @Value("${sname}") String name;

	  @GetMapping("/greet")
	  public String showLuckyWord() {
	    return "Hi: " + name;
	  }
	}
