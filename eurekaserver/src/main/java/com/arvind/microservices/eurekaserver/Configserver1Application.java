package com.arvind.microservices.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Configserver1Application {

	public static void main(String[] args) {
		SpringApplication.run(Configserver1Application.class, args);
	}
}
