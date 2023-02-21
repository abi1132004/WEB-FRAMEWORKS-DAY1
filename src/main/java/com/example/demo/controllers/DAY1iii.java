package com.example.demo.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DAY1iii {
	    String color="Green";
		@GetMapping("/")
		public String getName(){
			return "My favorite color is "+color;
		}
}
