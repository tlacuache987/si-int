package com.example.intertech.lab5.routers;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab5_b_App {

	public static void main(String[] args) {

		String src = "spring/lab5/si-xml-transformer-with-validation-filter.xml";

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(src);

		ctx.registerShutdownHook();
	}
}
