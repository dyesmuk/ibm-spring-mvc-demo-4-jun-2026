package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@GetMapping("/")
	@ResponseBody
	public String home() {
		System.out.println("home");
		return "Welcome!";
	}

	@GetMapping("/hi")
	@ResponseBody
	public String hi() {
		System.out.println("hi");
		return "Hi! How're you?";
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		System.out.println("hello");
		return "Hello World!";
	}
}