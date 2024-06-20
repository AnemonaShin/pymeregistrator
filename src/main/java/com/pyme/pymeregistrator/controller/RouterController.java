package com.pyme.pymeregistrator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RouterController {
    
	@GetMapping("*")
    public String error(Model model) {
        return "index";
    }


    @GetMapping({"/","/index","/home"})
	public String index(Model model) {
		
		return "index";
	}
}
