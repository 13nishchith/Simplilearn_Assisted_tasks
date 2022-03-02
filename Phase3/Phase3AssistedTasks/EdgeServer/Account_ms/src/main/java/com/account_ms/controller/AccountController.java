package com.account_ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping("/accounts/status/check")
	public String status() {
		return "Account service is working";
	}
}
