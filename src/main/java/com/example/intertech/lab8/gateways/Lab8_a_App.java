package com.example.intertech.lab8.gateways;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.MessageBuilder;

public class Lab8_a_App {

	public static void main(String[] args) {

		String src = "spring/lab8/si-no-gateway.xml";

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(src);

		MessageChannel inboundChannel = ctx.getBean("inboundChannel", MessageChannel.class);
		PollableChannel outboundChannel = ctx.getBean("outboundChannel", PollableChannel.class);

		String word = "Hello new fuckin world !!";

		System.out.println("word: " + word);

		Message<String> message = MessageBuilder.withPayload(word).build();

		boolean isSend = inboundChannel.send(message);

		if (isSend) {

			Message<String> response = (Message<String>) outboundChannel.receive();

			System.out.println("to pig latin: " + response.getPayload());

		}

		ctx.registerShutdownHook();
	}
}
