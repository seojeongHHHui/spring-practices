package com.poscodx.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(String name) { /* http://localhost:8080/hellospring/hello?name=hui */
		System.out.println(name);
		return "/WEB-INF/views/hello.jsp";
	}
	
}
