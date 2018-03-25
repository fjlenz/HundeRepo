package com.example.FJsGradleHelloWorld;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradleHelloWorldController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println("Someone Calling Hello on Gradle!");
		return "Hi my Gradle :) friend";
	}
}


