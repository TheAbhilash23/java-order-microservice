package com.example.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(OrderApplication.class);

		// Hardcode the external config location
		Map<String, Object> defaultProps = new HashMap<>();
		defaultProps.put("spring.config.location", "file:/home/abhilash/Desktop/learning/learn-java/microservices/order-microservice/src/main/resources/application.properties");
		app.setDefaultProperties(defaultProps);
		app.run(args);		}

}
