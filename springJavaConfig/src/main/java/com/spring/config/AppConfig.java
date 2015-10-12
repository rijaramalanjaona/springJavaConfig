package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.hello.HelloWorld;
import com.spring.hello.impl.HelloWorldImpl;

@Configuration
public class AppConfig {
	
	@Bean(name = "helloBean")
	public HelloWorld helloWorld() {
		return new HelloWorldImpl();
	}
	
}
