package com.spring.Sping_Boot_SecurityJDBC;

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
