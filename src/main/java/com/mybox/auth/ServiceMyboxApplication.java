package com.mybox.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ServiceMyboxApplication extends SpringBootServletInitializer{

	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder application) { return
	 * application.sources(ServiceMyboxApplication.class); }
	 */

	public static void main(String[] args) {
		SpringApplication.run(ServiceMyboxApplication.class, args);
	}

}
