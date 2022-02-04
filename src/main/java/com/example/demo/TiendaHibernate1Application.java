package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TiendaHibernate1Application extends SpringBootServletInitializer{

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(TiendaHibernate1Application.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(TiendaHibernate1Application.class, args);
	}

}
