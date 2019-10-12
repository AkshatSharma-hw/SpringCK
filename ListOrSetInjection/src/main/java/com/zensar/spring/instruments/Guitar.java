package com.zensar.spring.instruments;

import org.springframework.stereotype.Component;


public class Guitar implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("guitar playing");
	}

}
