package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.Greeting;

/**
 * @author akansh_sai
 * @version 1.0
 * @creation  date 7/10/2019 12:40pm
 * 
 *
 */
public class SpringMain {

	public static void main(String[] args) {
		//creating the object of spring ioc container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("greeting.xml");
		//FileSystemXmlApplicationContext for searching xml files when they are not in the project
		Greeting g = ctx.getBean("anniversary", Greeting.class);  //this will return object of festival greeting
	//	System.out.println(g.greet());
		Greeting g1 = ctx.getBean("festival", Greeting.class);
		//System.out.println(g1.greet());
	}

}
