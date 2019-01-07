package com.practice.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class HelloController {
	
	static void dpo() {}

	@RequestMapping("/hello")
	public String sayHi() {
	return "HIII";
	}
	
}
