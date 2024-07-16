package com.spring.boot.project.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomePage {

	
	@GetMapping("/")
	public String homeDirectory() {
		return "This is our home page ";
	}
	
	@GetMapping("/login")
	public String myLoging() {
		return "my login page ";
		
	}
}
