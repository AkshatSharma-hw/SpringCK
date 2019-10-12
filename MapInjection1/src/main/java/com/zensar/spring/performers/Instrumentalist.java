package com.zensar.spring.performers;

import java.util.List;
import java.util.Map;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	
	private Map<Instrument, String> InstrumentSongMap;
	@Override
	public void perform() {
		System.out.println("Instrumentalist is playing song");
		for (Map.Entry<Instrument, String> entry : InstrumentSongMap.entrySet()) {
			System.out.println("song " +entry.getKey()+" is played on instrument");
			entry.getKey().play();
		}
		
		
	}
	public Map<Instrument, String> getInstrumentSongMap() {
		return InstrumentSongMap;
	}
	public void setInstrumentSongMap(Map<Instrument, String> instrumentSongMap) {
		InstrumentSongMap = instrumentSongMap;
	}


}
