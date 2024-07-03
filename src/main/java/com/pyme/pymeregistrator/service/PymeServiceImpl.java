package com.pyme.pymeregistrator.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pyme.pymeregistrator.domain.MessageModel;
import com.pyme.pymeregistrator.repository.PymeRepository;
import com.pyme.pymeregistrator.request.AddPymeRequest;

@Service
public class PymeServiceImpl implements PymeService{

    @Autowired
    PymeRepository bdRepo;

    List<AddPymeRequest> listToAdd = new ArrayList<>();

    public List<AddPymeRequest> addToList(AddPymeRequest body) {

        listToAdd.add(body);

        return listToAdd;
    }

    public MessageModel addToBd(AddPymeRequest body) throws Exception{

        try{
            
            bdRepo.save(body);

            return new MessageModel("00","Pyme ingresada correctamente.");
        } catch(Exception e){
            throw new Exception(e.getMessage());
        }

    }

    public Iterable<AddPymeRequest> SearchInBd() {
        return bdRepo.findAll();
    }
}
