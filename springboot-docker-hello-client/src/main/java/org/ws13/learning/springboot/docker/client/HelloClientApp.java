package org.ws13.learning.springboot.docker.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableFeignClients
public class HelloClientApp {

	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext context;
		context = SpringApplication.run(HelloClientApp.class, args);

		HelloClient helloClient;
		helloClient = context.getBean(HelloClient.class);

		while (true) {
			String hello;
			hello = helloClient.sayHello();

			System.out.println("HelloClientApp.main: " + hello);
			Thread.sleep(15000);
		}
	}
}
