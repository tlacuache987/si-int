package com.example.intertech.lab6.routers;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab6_c_App {

	public static void main(String[] args) {

		String src = "spring/lab6/si-custom-router.xml";

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(src);

		ctx.registerShutdownHook();
	}
}
