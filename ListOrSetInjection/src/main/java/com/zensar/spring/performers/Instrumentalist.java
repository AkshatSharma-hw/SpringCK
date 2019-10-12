package com.zensar.spring.performers;

import java.util.List;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	private List<Instrument> instruments;
	public List<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(List<Instrument> instruments) {
		this.instruments = instruments;
	}

	private String song;
	public Instrumentalist() {
		// TODO Auto-generated constructor stub
		System.out.println("instrumentalist is created");
	}
	
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
		System.out.println("song is set");
	}
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("instrumentalist is playing a song "+song);
		for (Instrument instrument : instruments) {
			instrument.play();
		}
		
	}

}
