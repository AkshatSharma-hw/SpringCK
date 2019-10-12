package com.zensar.spring.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class Audience {
	
	@Pointcut("execution(* *.perform(..))")
	//@Pointcut("execution(void *.perform(..))")
	//@Pointcut("execution(void com.zensar.spring.performers.Juggler.perform(..))")
	//@Pointcut("execution(public void com.zensar.spring.performers.Juggler.perform(..))")
	public void performancePointCut() {}
	@Before("performancePointCut()")
	public void takeSeats() {
		System.out.println("Audience is taking their seats.");
	}
	
	//@Before("performancePointCut()")
	@Before("execution(* *.perform(..))")
	public void switchOffCell() {
		System.out.println("Audience is switching off their cell phones.");
		
	}
	
	@AfterReturning("performancePointCut()")
	public void applaud() {
		System.out.println("CLAP! CLAP! CALP!!!");
	}
	
	@AfterThrowing("performancePointCut()")
	public void demandRefund() {
		System.out.println("Give my money back!!!");
	}
}

