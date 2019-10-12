package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.exceptions.PerformanceException;

@Component("juggler")
public class Juggler implements Performer {
	@Value("2")
	private int beanBags;
	@Override
	public void perform() throws PerformanceException {
		if(beanBags < 3 ) {
			System.out.println("no. of bean bags are not sufficient.");
			throw new PerformanceException();
		}
		else {
			System.out.println("juggling "+beanBags+" bean bags.");
		}
		
	}

}
