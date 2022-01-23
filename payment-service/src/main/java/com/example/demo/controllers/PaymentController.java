package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "api/v2")
public class PaymentController {
	
	WebClient client;

	public PaymentController(WebClient client) {
		super();
		this.client = client;
	}
	
	@GetMapping(path = "/client")
	public Mono<String> getDrivers(){
		
		return this.client.get()
				.uri("lb://DRIVER-SERVICE:3030/api/v1/drivers")
				.retrieve()
				.bodyToMono(String.class);
	}
	
	
	
	

}
