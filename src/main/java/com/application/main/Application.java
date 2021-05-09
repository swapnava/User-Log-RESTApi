package com.application.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.application.CustomerLog")
@EntityScan("com.application.CustomerLog")
@EnableJpaRepositories("com.application.CustomerLog")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
