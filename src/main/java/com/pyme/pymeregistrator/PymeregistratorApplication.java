package com.pyme.pymeregistrator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class PymeregistratorApplication {

	@GetMapping("*")
    public String error(Model model) {
        return "index";
    }

	public static void main(String[] args) {
		SpringApplication.run(PymeregistratorApplication.class, args);
	}

}
