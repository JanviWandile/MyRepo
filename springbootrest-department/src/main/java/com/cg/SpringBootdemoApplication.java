package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootdemoApplication.class, args);
	}

}
