package com.user_ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

	@GetMapping("/users/status/check")
	public String status() {
		return "user service is working";
	}
}
