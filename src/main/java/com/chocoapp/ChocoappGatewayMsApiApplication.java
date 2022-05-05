package com.chocoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class ChocoappGatewayMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChocoappGatewayMsApiApplication.class, args);
	}

}
