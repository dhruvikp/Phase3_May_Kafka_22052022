package com.simplilearn.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaReceiver {

	@KafkaListener(topics="simplilearn", groupId="group_0")
	public void consumeMessage(String message) {
		System.out.println("Consumed Message$$$" + message);
	}
	
	@KafkaListener(topics="simplilearn", groupId="group_1")
	public void consumeMessage1(String message) {
		System.out.println("Consumed Message$$$" + message);
	}
}
