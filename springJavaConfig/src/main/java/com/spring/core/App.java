package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;
import com.spring.hello.HelloWorld;

public class App {
    public static void main(String[] args) {

	ApplicationContext context = new AnnotationConfigApplicationContext(
		AppConfig.class);
	HelloWorld obj = (HelloWorld) context.getBean("helloBean");

	obj.printHelloWorld("Spring3 Java Config");

    }
}