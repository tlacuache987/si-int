package com.example.intertech.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

public class Lab1_d_App {

	public static void main(String[] args) {

		String src = "spring/lab1/si-direct-channel.xml";

		ApplicationContext ctx = new ClassPathXmlApplicationContext(src);

		/*while (true) {
		
		}*/

		MessageChannel channel = ctx.getBean("messageChannel", MessageChannel.class);

		Message<String> message1 = MessageBuilder.withPayload("Hello world - one!").build();

		Message<String> message2 = MessageBuilder.withPayload("Hello world - two!").build();

		Message<String> message3 = MessageBuilder.withPayload("Hello world - three!").build();

		System.out.println("sending message1");

		channel.send(message1);

		System.out.println("sending message2");

		channel.send(message2);

		System.out.println("sending message3");

		channel.send(message3);

		System.out.println("done sending messages");

	}
}
