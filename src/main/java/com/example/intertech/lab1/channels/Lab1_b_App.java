package com.example.intertech.lab1.channels;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1_b_App {

	public static void main(String[] args) {

		String src = "spring/lab1/si-pollable-channel.xml";

		ApplicationContext ctx = new ClassPathXmlApplicationContext(src);

		while (true) {

		}
	}
}
