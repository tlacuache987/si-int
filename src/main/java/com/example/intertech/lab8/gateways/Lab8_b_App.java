package com.example.intertech.lab8.gateways;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.intertech.lab8.gateways.service.PigLatinService;

public class Lab8_b_App {

	public static void main(String[] args) {

		String src = "spring/lab8/si-gateway.xml";

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(src);

		PigLatinService pigLatinService = ctx.getBean("pigLatinService", PigLatinService.class);

		String word = "Hello new fuckin world !!";

		System.out.println("word: " + word);

		String response = pigLatinService.translate(word);

		System.out.println("to pig latin: " + response);
	}
}
