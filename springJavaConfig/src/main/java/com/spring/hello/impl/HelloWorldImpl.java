package com.spring.hello.impl;

import com.spring.hello.HelloWorld;

public class HelloWorldImpl implements HelloWorld {

    public void printHelloWorld(String msg) {
	System.out.println("Hello : " + msg);
    }

}
