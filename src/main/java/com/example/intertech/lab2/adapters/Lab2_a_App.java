package com.example.intertech.lab2.adapters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab2_a_App {

	public static void main(String[] args) {

		String src = "spring/lab2/si-file-inbound-outbound-adapter.xml";

		ApplicationContext ctx = new ClassPathXmlApplicationContext(src);

		while (true) {

		}
	}
}
