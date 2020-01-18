package com.spring.Spring_Boot_Security_JPAAuthentication_MySQL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return ("Welcome All");
	}
	
	@GetMapping("/user")
	public String user() {
		return ("Welcome user");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("Welcome admin");
	}
}
