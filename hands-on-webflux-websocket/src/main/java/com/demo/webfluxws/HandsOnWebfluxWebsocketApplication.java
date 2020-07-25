package com.demo.webfluxws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HandsOnWebfluxWebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandsOnWebfluxWebsocketApplication.class, args);
	}

}
