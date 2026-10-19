package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpringController {
	
    @GetMapping("/hello")
	public String hello() {
		//HTMLテンプレートに hello-springを指定。(.htmlは省略できる。)
		return "hello-spring";
	}
}
