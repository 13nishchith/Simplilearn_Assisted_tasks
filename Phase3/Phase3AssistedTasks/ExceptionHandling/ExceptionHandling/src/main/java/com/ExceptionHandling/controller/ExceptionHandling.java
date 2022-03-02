package com.ExceptionHandling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionHandling {
	
	@GetMapping("/calculator")
	public int calculator() {
		int a=10;
		int b=0;
		
		int result=0;
		result =a/b;
		return result;
	}
	@GetMapping("/array")
	public int array() {
		int a[]= {1,2,3};
		int b=a[5];
		
		return b;
	}
	
}
