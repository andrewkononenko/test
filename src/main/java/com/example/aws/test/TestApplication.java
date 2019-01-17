package com.example.aws.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication {

	@GetMapping("/init")
	public String getInit() {
		return "Init endpoint";
	}

    @GetMapping("/")
    public String getHealth() {
        return "Status up";
    }

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}

