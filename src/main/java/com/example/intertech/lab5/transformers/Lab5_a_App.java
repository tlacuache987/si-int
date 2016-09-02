package com.example.intertech.lab5.transformers;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab5_a_App {

	public static void main(String[] args) {

		String src = "spring/lab5/si-simple-transformer.xml";

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(src);

		ctx.registerShutdownHook();
	}
}
