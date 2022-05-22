package com.simplilearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	private final String TOPIC_NAME = "simplilearn";

	public void send(String message) {
		kafkaTemplate.send(TOPIC_NAME, message);
	}

}
