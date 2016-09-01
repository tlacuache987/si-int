package com.example.intertech.lab4.transformers.serviceactivator;

import org.springframework.messaging.MessageHandlingException;

public class ErrorHandlingServiceActivator {

	public void printError(MessageHandlingException exception) {
		System.out.println("Exception: " + exception.getMessage());
	}

}
