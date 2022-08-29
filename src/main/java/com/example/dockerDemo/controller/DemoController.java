package com.example.dockerDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController 
{
	
	
	
	@GetMapping("/home")
	public String massage()
	{
		return "Welcome to Docker";
	}
	
	@GetMapping("/msg")
	public String msg()
	{
		return "hello";
	}
	

}
