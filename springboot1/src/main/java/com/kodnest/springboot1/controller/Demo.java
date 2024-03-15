package com.kodnest.springboot1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	
	@GetMapping(value="/greet")
	public String greet() {
		return "Welcome to spring-boot";
	}

}
