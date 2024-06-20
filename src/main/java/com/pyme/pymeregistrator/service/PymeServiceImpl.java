package com.pyme.pymeregistrator.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pyme.pymeregistrator.request.AddPymeRequest;

@Service
public class PymeServiceImpl implements PymeService{

    List<AddPymeRequest> listToAdd = new ArrayList<>();

    public List<AddPymeRequest> addToList(AddPymeRequest body) {

        listToAdd.add(body);

        return listToAdd;
    }
}
