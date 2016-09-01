package com.example.intertech.lab4.transformers;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab4_a_App {

	public static void main(String[] args) {

		String src = "spring/lab4/si-simple-transformer.xml";

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(src);

		ctx.registerShutdownHook();
	}
}
