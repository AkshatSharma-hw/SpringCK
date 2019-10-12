package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("anniversary")
public class AnniversaryGreeting implements Greeting {

	@Override
	public String greet() {
		
		return "sad life ";
	}
	public AnniversaryGreeting() {
		
		System.out.println("anniversary greeting is created");
	}
}
