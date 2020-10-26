package com.example.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TesteApplication {
//public class TesteApplication extends SpringBootServletInitializer{
	
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(TesteApplication.class);
//	}

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);
	}

}
