package com.mehmetyilmaz.teletubbies;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TeletubbiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeletubbiesApplication.class, args);
	}

	@Bean
	public ModelMapper getModalMapper () {
		return new ModelMapper();
	}
}
