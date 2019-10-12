package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("festival")
public class FestivalGreeting implements Greeting {

	@Override
	public String greet() {
	
		return "happy life";
	}
	public FestivalGreeting() {
		
		System.out.println("festival greeting is created");
	}

}
