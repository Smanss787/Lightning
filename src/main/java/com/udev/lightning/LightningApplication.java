package com.udev.lightning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.udev.lightning.repo") 
@EntityScan("com.udev.lightning.beans")
@SpringBootApplication
public class LightningApplication {

	public static void main(String[] args) {
		SpringApplication.run(LightningApplication.class, args);
	}
}
