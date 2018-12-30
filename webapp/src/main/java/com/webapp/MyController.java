package com.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/webapp")
public class MyController {
	
	@RequestMapping("/homepage")
	public String homePage() {
		return "homepage";
	}
}
