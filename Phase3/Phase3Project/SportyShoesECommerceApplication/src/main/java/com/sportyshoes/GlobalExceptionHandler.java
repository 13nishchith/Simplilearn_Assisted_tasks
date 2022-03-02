package com.sportyshoes;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public String handleException(Exception e) {
		e.printStackTrace();
		return "Error occured";
	}
}
