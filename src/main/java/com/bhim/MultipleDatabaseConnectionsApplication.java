package com.bhim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class MultipleDatabaseConnectionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipleDatabaseConnectionsApplication.class, args);
	}

}
