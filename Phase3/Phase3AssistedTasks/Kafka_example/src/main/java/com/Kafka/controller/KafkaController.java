package com.Kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Kafka.service.*;

@RestController
public class KafkaController {

	@Autowired
	KafkaService kafkaService;
	
	@GetMapping("/producer")
	public String producer(@RequestParam("message") String message) {
		
		kafkaService.publish(message);
		return "Message sent to kafka topic successfully";
		
	}
}
