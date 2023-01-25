package com.example.demospringbootec2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringbootEc2Application {

	@GetMapping("/")
	public String home() {
		return "I love chocolate!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootEc2Application.class, args);
	}

}
