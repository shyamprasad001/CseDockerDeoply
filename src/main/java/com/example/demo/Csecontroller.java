package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Csecontroller {
	@GetMapping("/add")
	public int cseadd(@RequestParam int a, @RequestParam int b) {
		return a + b;
	}
	
	@GetMapping("/mul")
	public int csemul(@RequestParam int a, @RequestParam int b) {
		return a * b;
	}
}
