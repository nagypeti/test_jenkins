package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

asdasdasdasd


@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/")
	public String hello() {
		return "Hello Crappy Jenkins!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

