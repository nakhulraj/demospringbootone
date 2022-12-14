package com.demospringbootapi.demospringbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemospringbootapiApplication {
	@RequestMapping(value="/msg", method=RequestMethod.GET)
	public String message() {
	 return "Message";	
	}

	public static void main(String[] args) {
		SpringApplication.run(DemospringbootapiApplication.class, args);
	}

}
