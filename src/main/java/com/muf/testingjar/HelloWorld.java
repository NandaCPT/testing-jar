package com.muf.testingjar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping("/")
	public String home() {
		String response = "Hello World";
		return response;
		
	}
}
