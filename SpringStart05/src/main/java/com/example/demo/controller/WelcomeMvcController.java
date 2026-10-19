package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class WelcomeMvcController {
	
	@GetMapping("/welcome-m")
	public String welcomeM(@RequestParam("name1") String name, Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("welcome", "Welcome MVC (Model)");
		
		return "welcome-mvc";
		
	}
	
	@GetMapping("/welcome-mv")
	public ModelAndView welcomeMv(ModelAndView mv) {
		mv.addObject("Title", "ありブログ");
		mv.addObject("greeting", "ありやっほ！");
		mv.addObject("welcome", "Welcome MVC (Model");
		
		mv.setViewName("welcome-mvc");
		
		return mv;
	}
	
}
