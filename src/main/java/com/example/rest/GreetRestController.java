package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest1")
public class GreetRestController {
	@GetMapping//("/greet") if only one method so it is optional
	public String getGreetMsg() {
		
		String msg = "Good Morning....!!";
		
		return msg;
	}
	@GetMapping("/wish")
	public String getWish() {
		
		String msg = "All the best..!";
				
		return msg;
	}

}
