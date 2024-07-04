package com.pyme.pymeregistrator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pyme.pymeregistrator.request.AddPymeRequest;
import com.pyme.pymeregistrator.service.PymeService;


@Controller
public class PymeController {
 
    @Autowired
    PymeService service;

    @PostMapping("/add")
    public String addPyme(@ModelAttribute AddPymeRequest body, Model model) throws Exception{

        service.addToBd(body);

        model.addAttribute("pyme", service.SearchInBd());

        return "redirect:/";
    }

    @PostMapping("/edit")
    public String editPyme(@ModelAttribute AddPymeRequest body, Model model) throws Exception{

        service.editInBd(body.getId(), body);

        model.addAttribute("pyme", service.SearchInBd());

        return "redirect:/";
    }

    
    @GetMapping("/delete/{id}")
    public String deletePyme(@PathVariable Long id, Model model) throws Exception{

        service.deleteInBdById(id);

        model.addAttribute("pyme", service.SearchInBd());

        return "redirect:/";
    }
}
