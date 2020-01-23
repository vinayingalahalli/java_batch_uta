package com.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@RequestMapping("/")
	public String sayHello() {
		return "Hello from REST Controller of Spring";
	}
}
