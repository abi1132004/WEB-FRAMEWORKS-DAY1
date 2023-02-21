package com.example.demo.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
public class DAY1ii {
	@RestController
	public class ApiController {
	    String studentName="IamNeo";
		@GetMapping("/")
		public String getName(){
			return "Welcome"+studentName+"!";
		}
	}
}