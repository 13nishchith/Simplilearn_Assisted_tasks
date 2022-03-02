package com.ExceptionHandling.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

	@ExceptionHandler(value = ArithmeticException.class)
	public String exceptionHandler() {
		return "Arithmetic exception occured";
	}
	
	@ExceptionHandler(value=ArrayIndexOutOfBoundsException.class)
	public String exceptionHandler1() {
		return "Array index out of bound exception occured";
	}
		
}
