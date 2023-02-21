package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
public class DAY1i {
	@RestController
	public class demoController {
		@GetMapping("/")
		public String decontroller(){
			return "Hi guys";
		}
	}
}
