package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {



	@Value("${app.my.prop.name}")
	String name;



	@GetMapping("/")
	public String index() {
		return "A Leo le gusta Derik! " + name;
	}

}
