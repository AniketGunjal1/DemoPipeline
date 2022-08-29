package com.Hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
	
	@RestController
	public class helloWorld{
		@RequestMapping(value= "/Hello")
		
	public String hello() {
			return "Hello World";
		}
		
	}

}
