package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1")
public class DriverController {
	
	@Value("${server.port}")
	private int port;
	
	@Value("${author.location}")
	private String auther;
	
	@GetMapping(path = "/drivers")
	public String getDrivers() {
		return auther+" Added:" + "Vishal,Vicky,Ramesh,Suresh,Mangesh"+ port;
	}
	

}
