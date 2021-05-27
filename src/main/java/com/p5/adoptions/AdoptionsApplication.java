package com.p5.adoptions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class AdoptionsApplication {

	public static void main(String[] args) {

		SpringApplication.run(AdoptionsApplication.class, args);
	}

}
