package com.Hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
		
	}
	
	
	@RestController 
	class helloWorld{
		@RequestMapping(value= "/")
		
		//@GetMapping("/")    
		public String hello() {         
		return "<h1><b>Service is up and running</b></h1>"; 
		}
		
	//public String hello() {
			//return "Hello World";
	
		//}
		
	
	}

}
