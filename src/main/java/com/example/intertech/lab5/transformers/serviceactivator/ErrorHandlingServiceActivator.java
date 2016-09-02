package com.example.intertech.lab5.transformers.serviceactivator;

import org.springframework.messaging.MessageHandlingException;

public class ErrorHandlingServiceActivator {

	public void printError(MessageHandlingException exception) {
		System.out.println("Exception: " + exception.getMessage());
	}

}
