package com.jenkins.practice;

import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		 ILoggerFactory loggerFactory= LoggerFactory.getILoggerFactory();
		SpringApplication.run(PracticeApplication.class, args);
	}

	@RestController
	class Controller{

		@GetMapping("/hello")
		public String getHello(){
			return "Hello world";
		}

	}

	public static void sample(){
		System.out.println("hello system");
	}

}
