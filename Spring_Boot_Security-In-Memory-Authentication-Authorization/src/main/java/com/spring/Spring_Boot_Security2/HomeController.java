package com.spring.Spring_Boot_Security2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return ("Welcome");
	}
	
	@GetMapping("/user")
	public String user() {
		return ("Welcome User");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("Welcome Admin");
	}
}
