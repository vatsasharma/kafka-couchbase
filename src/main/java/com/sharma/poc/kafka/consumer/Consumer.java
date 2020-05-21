package com.sharma.poc.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics = "testTopic", groupId = "group_id")
	public void consume(String message) {
		System.out.println(message);
	}

}
