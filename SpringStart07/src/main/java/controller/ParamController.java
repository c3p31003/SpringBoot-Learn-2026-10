package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ParamController {
	
	@GetMapping("/input")
	public String input() {
		return "input";
	}

}
