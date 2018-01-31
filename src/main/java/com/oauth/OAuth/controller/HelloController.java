package com.oauth.OAuth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value="/")
	public String getHello() {
		return "Hello";
	}
	
	@GetMapping(value="/private")
	public String privateArea() {
		return "Private";
	}
}
