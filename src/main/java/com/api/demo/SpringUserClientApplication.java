package com.api.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

 

@SpringBootApplication
public class SpringUserClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringUserClientApplication.class, args);
		 ApiConnector api = new ApiConnector();
	        List<User> user =  api.getJSONArray();
	       // user.forEach(System.out::print);
	      user.forEach(s -> System.out.println(s.getFirst_name()));      
	       
	}

}
