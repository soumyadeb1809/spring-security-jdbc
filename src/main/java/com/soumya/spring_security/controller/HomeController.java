package com.soumya.spring_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public @ResponseBody String greet() {
		return (
				"<h1>Welcome All</h1>"
		);
	}
	
	@GetMapping("/user")
	public @ResponseBody String user() {
		return (
				"<h1>Welcome User</h1>"
		);
	}
	
	@GetMapping("/admin")
	public @ResponseBody String admin() {
		return (
				"<h1>Welcome Admin</h1>"
		);
	}

}
