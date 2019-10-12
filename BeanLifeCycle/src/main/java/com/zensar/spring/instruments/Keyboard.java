package com.zensar.spring.instruments;

public class Keyboard implements Instrument {
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("ping ding");
	}
	
	public void tune() {
		System.out.println("keyboard tuned.");
	}
	public void clean() {
		System.out.println("keyboard is cleaned.");
	}
}
