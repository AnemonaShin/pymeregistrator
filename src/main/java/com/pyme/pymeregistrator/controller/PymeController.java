package com.pyme.pymeregistrator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pyme.pymeregistrator.model.MsgModel;
import com.pyme.pymeregistrator.request.AddPymeRequest;
import com.pyme.pymeregistrator.response.PymeInfoResponse;
import com.pyme.pymeregistrator.service.PymeServiceInt;



@RestController()
@RequestMapping("/pyme/registrator")
public class PymeController {
    
    @Autowired
    public PymeServiceInt service;

    @PostMapping("/add")
    public ResponseEntity<MsgModel> postMethodName(@RequestBody AddPymeRequest body) throws Exception{
        return new ResponseEntity<MsgModel>(service.addPyme(body),HttpStatus.CREATED);
    }
    
    @GetMapping("/list")
    public PymeInfoResponse getMethodName(@RequestParam String id) throws Exception{
        return service.pymeInfo(id);
    }
}
