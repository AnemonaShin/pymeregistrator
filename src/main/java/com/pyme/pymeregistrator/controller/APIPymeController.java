package com.pyme.pymeregistrator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pyme.pymeregistrator.domain.MessageModel;
import com.pyme.pymeregistrator.request.AddPymeRequest;
import com.pyme.pymeregistrator.service.PymeService;



@RestController
@RequestMapping("/v1/pyme-request")
public class APIPymeController {
    
    @Autowired
    PymeService service;

    @PostMapping("/add")
    public MessageModel addPymeMethod(@RequestBody AddPymeRequest body) throws Exception{
        return service.addToBd(body);
    }

    @GetMapping("/list")
    public Iterable<AddPymeRequest> getPymeMethod() {
        return service.SearchInBd();
    }
    
    

}
