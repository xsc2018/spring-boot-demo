package com.example.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class DemoApplication {

	@RequestMapping("/sayhello")
	String sayHello(){
		return "hello world";
	}
	@RequestMapping("/showdate")
	Date showDate(){
		return new Date();
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
