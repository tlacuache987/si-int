package com.example.intertech.lab4.transformers;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab4_d_App {

	public static void main(String[] args) {

		String src = "spring/lab4/si-xml-transformer-with-validation-filter.xml";

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(src);

		ctx.registerShutdownHook();
	}
}
