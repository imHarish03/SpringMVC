package com.lab.springmvc.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

	public String welcomeMessage() {
		return "Welcome to Spring MVC";
	}

}
