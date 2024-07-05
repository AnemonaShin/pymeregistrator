package com.pyme.pymeregistrator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pyme.pymeregistrator.service.PymeService;

@Controller
public class RouterController {
    
    @Autowired
    PymeService service;

	@GetMapping("*")
    public String error(Model model) {
        return "index";
    }


    @GetMapping({"/","/index","/home"})
	public String index(Model model) {
		
        model.addAttribute("pyme", service.searchInBd());

		return "index";
	}
}
