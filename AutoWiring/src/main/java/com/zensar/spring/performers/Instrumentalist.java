package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.instruments.Instrument;

@Component("Chetna")
public class Instrumentalist implements Performer {
	
	@Autowired
	@Qualifier("g")
	private Instrument instrument;
	@Value("hell fire")
	private String song;
	public Instrumentalist() {
		// TODO Auto-generated constructor stub
		System.out.println("instrumentalist is created");
	}
	public Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("instrument is set");
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
		instrument.play();
		
	}

}
