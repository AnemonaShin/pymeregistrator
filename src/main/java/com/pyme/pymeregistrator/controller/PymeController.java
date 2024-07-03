package com.pyme.pymeregistrator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pyme.pymeregistrator.request.AddPymeRequest;
import com.pyme.pymeregistrator.service.PymeService;


@Controller
@RequestMapping("/pyme")
public class PymeController {
 
    @Autowired
    PymeService service;

    @PostMapping("/add")
    public String addPyme(@ModelAttribute AddPymeRequest body, Model model) throws Exception{

        service.addToBd(body);

        //Para envio de data a Servicio.
        model.addAttribute("pyme", service.SearchInBd());

        return "index";
    }

    @GetMapping({"/","/index","/home"})
	public String index(Model model) {
		
		return "index";
	}
}
