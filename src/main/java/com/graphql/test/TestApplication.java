package com.graphql.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.graphql.test.services","com.graphql.test.dao","com.graphql.test.controllers"})
public class TestApplication{

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
