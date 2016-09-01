package com.example.intertech.lab3.filters;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.SneakyThrows;

public class Lab3_z_rabbitmq_App {

	@SneakyThrows
	public static void main(String[] args) {

		String src = "spring/lab3/si-rabbitmq-filter.xml";

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(src);

		while (true) {

		}

		/*MessageChannel toRabbitchannel = ctx.getBean("to-rabbit-channel", MessageChannel.class);
		
		for (int i = 0; i < 2000; i++) {
		
			Message<String> message = MessageBuilder.withPayload("Message # " + (i + 1) + " deliver to RabbitMQ.")
					.build();
		
			toRabbitchannel.send(message);
		
			Thread.sleep(5);
		}
		
		ctx.registerShutdownHook();*/
	}
}
