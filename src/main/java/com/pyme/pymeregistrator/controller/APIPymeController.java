package com.pyme.pymeregistrator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public ResponseEntity<MessageModel> addPymeMethod(@RequestBody AddPymeRequest body) throws Exception{
        return service.addToBd(body);
    }

    @GetMapping("/list")
    public Iterable<AddPymeRequest> getPymeMethod() {
        return service.SearchInBd();
    }

    @PatchMapping("/edit")
    public ResponseEntity<MessageModel> editPyme(@RequestParam Long id, @RequestBody AddPymeRequest body) throws Exception{
        return service.editInBd(id, body);
    }
    
    @PatchMapping("/delete")
    public ResponseEntity<MessageModel> deletePyme(@RequestParam Long id) throws Exception{
        return service.deleteInBdById(id);
    }
}
