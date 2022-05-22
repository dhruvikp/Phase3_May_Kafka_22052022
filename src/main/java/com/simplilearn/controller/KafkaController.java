package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.service.KafkaSender;

@RestController
public class KafkaController {

	@Autowired
	KafkaSender kafkaSender;

	@GetMapping("/produce")
	public String produce(@RequestParam("message") String message) {
		kafkaSender.send(message);
		return "Message sent to the Kafka Topic Simplilearn successfully";
	}
}
