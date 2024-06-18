package com.pyme.pymeregistrator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@SpringBootApplication
public class PymeregistratorApplication {

	@GetMapping({"/","/index","/home"})
	public String index(Model model){

		return "index";
	}


	public static void main(String[] args) {
		SpringApplication.run(PymeregistratorApplication.class, args);
	}

}
