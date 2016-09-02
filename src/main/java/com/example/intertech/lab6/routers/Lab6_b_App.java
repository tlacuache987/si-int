package com.example.intertech.lab6.routers;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab6_b_App {

	public static void main(String[] args) {

		String src = "spring/lab6/si-content-xpath-router-with-recipient-list-router.xml";

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(src);

		ctx.registerShutdownHook();
	}
}
