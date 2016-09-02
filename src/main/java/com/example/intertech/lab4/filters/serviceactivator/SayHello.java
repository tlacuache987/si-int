package com.example.intertech.lab4.filters.serviceactivator;

import org.springframework.stereotype.Component;

@Component("sayHelloBean")
public class SayHello {

	public String sayHello(String name) {

		return "hello " + name;

	}

}
