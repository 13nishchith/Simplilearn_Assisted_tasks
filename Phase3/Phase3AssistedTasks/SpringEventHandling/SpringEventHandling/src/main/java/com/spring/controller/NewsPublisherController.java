package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.publisher.NewsEventPublisher;

@Controller
public class NewsPublisherController {

	@Autowired
	NewsEventPublisher newsEventPublisher;

	@GetMapping("/toi/publish")
	public String publish() {
		newsEventPublisher.publish();
		return "published";
	}
}
