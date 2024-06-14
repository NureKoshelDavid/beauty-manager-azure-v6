package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("https://beauty-manager-frontend.azurewebsites.net/")
public class GatewayApplication {

	public static void main(String[] args){
		SpringApplication.run(GatewayApplication.class, args);
	}

}
