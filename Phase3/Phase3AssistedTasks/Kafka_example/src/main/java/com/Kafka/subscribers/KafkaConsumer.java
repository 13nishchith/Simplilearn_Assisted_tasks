package com.Kafka.subscribers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	private static final String TOPIC="simplilearn";
	
	@KafkaListener(topics=TOPIC,groupId="group_1")
	public void consume(String message) {
		System.out.println("consuming message from group1" +message);
	}
	
	
	@KafkaListener(topics=TOPIC,groupId="group_2")
	public void consume1(String message) {
		System.out.println("consuming message from group2" +message);
	}
}
