package com.demo.ghanghor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
public class GhanghorApplication {

	public static void main(String[] args) {
		SpringApplication.run(GhanghorApplication.class, args);
	}
	
	@RequestMapping(value = "/events/{data}", method = RequestMethod.GET)
	public ResponseEntity events(@PathVariable Object data) {
		System.out.println("Exceted GET method with param.." + data);
			return ResponseEntity.status(HttpStatus.OK).body(data);
	}
		
	@RequestMapping(value = "/events", method = RequestMethod.GET)
	public ResponseEntity events2() {
			System.out.println("Exceted GET method without param..");
			return ResponseEntity.status(HttpStatus.OK).build();
	}
}
