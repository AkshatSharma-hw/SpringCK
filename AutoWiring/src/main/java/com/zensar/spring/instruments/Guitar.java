package com.zensar.spring.instruments;

import org.springframework.stereotype.Component;

@Component("g")
public class Guitar implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("a");
	}

}
