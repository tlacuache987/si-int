package com.example.intertech.lab3.serviceactivators;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab3_a_App {

	public static void main(String[] args) {

		String src = "spring/lab3/si-simple-serviceactivator.xml";

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(src);

		ctx.registerShutdownHook();
	}
}
