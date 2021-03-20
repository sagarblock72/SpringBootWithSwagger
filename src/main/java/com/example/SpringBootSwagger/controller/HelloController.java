package com.example.SpringBootSwagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayhello() {
		String s="fdf";
		return "hello";
	}

}
