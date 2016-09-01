package com.example.intertech.lab3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import lombok.SneakyThrows;

public class Lab3_c_App {

	@SneakyThrows
	public static void main(String[] args) {

		String src = "spring/lab3/si-rabbit-filter.xml";

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(src);

		/*while (true) {
		
		}*/

		MessageChannel toRabbitchannel = ctx.getBean("to-rabbit-channel", MessageChannel.class);

		for (int i = 0; i < 20000; i++) {

			Message<String> message = MessageBuilder.withPayload("Message # " + (i + 1) + " deliver to RabbitMQ.")
					.build();

			toRabbitchannel.send(message);

			Thread.sleep(10);
		}

		ctx.registerShutdownHook();
	}
}
