package com.pyme.pymeregistrator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pyme.pymeregistrator.request.AddPymeRequest;
import com.pyme.pymeregistrator.response.PymeInfoResponse;
import com.pyme.pymeregistrator.service.PymeServiceInt;

@RestController
@RequestMapping("/pyme/registrator")
public class PymeController {
    
    @Autowired
    public PymeServiceInt service;

    //----- API METHODS ------
    /**
     * API que se encarga de agregar desde body informacion a una lista.
     * @param body
     * @return String
     * @throws Exception
     */
    @PostMapping("/api/add")
    public String addPyme(@RequestBody AddPymeRequest body) throws Exception{
        return service.addPyme(body);
    }

    /**
    * Servicio que se encarga de listar la informacion desde una lista.
    * @param id
    * @return Object
    * @throws Exception
    */
    @GetMapping("/api/list")
    public PymeInfoResponse listPymeById(@RequestParam String id) throws Exception{
        return service.pymeInfo(id);
    }
    //------------------------

    @PostMapping("/add")
    public ModelAndView addPyme(@ModelAttribute AddPymeRequest body, Model model) throws Exception{

        //Para envio de data a Servicio.
       service.addPyme(body);

       //ModelAndView para redirigir una vez realizado el post
        return new ModelAndView("redirect:/");
    }

    @GetMapping("/list")
    public Model getPymeAdded(Model model) throws Exception{
        return model.addAttribute("pyme", service.actualPymeInfo());
    }
    
    
    
}
