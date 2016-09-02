package com.example.intertech.lab3.serviceactivators.serviceactivator;

import com.example.intertech.lab3.serviceactivators.model.Hello;

public class GreetingServiceActivator {

	public Hello sayHello(String name) {
		return new Hello("hello " + name);
	}
}
