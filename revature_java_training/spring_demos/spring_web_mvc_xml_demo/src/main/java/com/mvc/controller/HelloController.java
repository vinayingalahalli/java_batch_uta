package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hi/{name}")
	public String sayHello(@PathVariable("name")String name,ModelMap map) {
		System.out.println("Hello "+name);
		map.addAttribute("message", name);
		return "welcome";
	}
}
