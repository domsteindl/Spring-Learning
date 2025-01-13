package com.example.web;

import org.springframework.boot.SpringApplication;


public record Greeting(long id, String content) { }

 {
	
	// public static void main(String[] args) {
	// 	SpringApplication.run(restervice.class, args);
	// }

//	@GetMapping("/hello")
//	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
//		return String.format("Hello %s!", name);
//	}
	
}
