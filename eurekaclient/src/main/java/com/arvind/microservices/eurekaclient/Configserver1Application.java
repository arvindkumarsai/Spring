package com.arvind.microservices.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Configserver1Application {

	public static void main(String[] args) {
		SpringApplication.run(Configserver1Application.class, args);
	}

	@RequestMapping("/greet")
	public String greeting() {
		return "Hello from EurekaClient!";
	}
	
	@GetMapping("/convert/tolower/{tolower}")
	public String toLower(@PathVariable String tolower) {
		return tolower.toLowerCase();
	}
	
	/*@GetMapping("/")
	  public String getWord() {
	    String[] wordArray = words.split(",");
	    int i = (int)Math.round(Math.random() * (wordArray.length - 1));
	    return wordArray[i];
	  }*/
}
