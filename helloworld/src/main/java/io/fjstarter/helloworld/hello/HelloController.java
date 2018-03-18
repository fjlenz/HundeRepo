package io.fjstarter.helloworld.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println("Someone Calling Hello");
		return "Hi my friend";
	}
	
	
	
	
}
