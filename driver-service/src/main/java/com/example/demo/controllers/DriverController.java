package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1")
public class DriverController {
	
	@GetMapping(path = "/drivers")
	public String getDrivers() {
		return "Vishal,Vicky,Ramesh,Suresh,Mangesh";
	}
	

}
