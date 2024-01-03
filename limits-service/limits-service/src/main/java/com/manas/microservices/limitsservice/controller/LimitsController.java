package com.manas.microservices.limitsservice.controller;


import com.manas.microservices.limitsservice.configuration.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manas.microservices.limitsservice.bean.Limits;

@RestController
public class LimitsController {
	@Autowired
	private Configuration configuration;
	
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
		//return new limits(1,1000);
	}

}
