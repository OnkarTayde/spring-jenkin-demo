package com.example.dockerDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController 
{
	
	
	
	@GetMapping("/home")
	public String massage()
	{
		return "Welcome to Docker world";
	}
	
	@GetMapping("/msg")
	public String msg()
	{
		return "hello";
	}
	
	@GetMapping("/msg2")
	public String msg2()
	{
		return "hello2";
	}
	

}
