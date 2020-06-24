package com.shraddha.bookwebapp.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.shraddha.bookwebapp"})
@EnableJpaRepositories(basePackages = {"com.shraddha.bookwebapp.repository"})
@EntityScan( basePackages = {"com.shraddha.bookwebapp.model"} )
public class BookWebappApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookWebappApplication.class, args);
	}

}
