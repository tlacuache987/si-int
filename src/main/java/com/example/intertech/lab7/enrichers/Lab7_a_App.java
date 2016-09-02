package com.example.intertech.lab7.enrichers;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab7_a_App {

	public static void main(String[] args) {

		String src = "spring/lab7/si-simple-enricher.xml";

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(src);

		ctx.registerShutdownHook();
	}
}
