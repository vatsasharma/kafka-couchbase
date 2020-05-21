package com.sharma.poc.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sharma.poc.kafka.model.User;
import com.sharma.poc.kafka.producer.Producer;

@RestController
public class KafkaController {
	
	@Autowired
	private Producer producer;
	
	@PostMapping("/publish")
	public void publishUser(@RequestBody User user) {
		producer.sendMessage(user.toString());
	}

}
