package com.example.intertech.lab3.filters.messageselector;

import java.io.File;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

public class FileSelector implements MessageSelector {

	@Override
	public boolean accept(Message<?> message) {
		return (message.getPayload() instanceof File && ((File) message.getPayload()).getName().startsWith("msg"))
				? true : false;
	}

}
