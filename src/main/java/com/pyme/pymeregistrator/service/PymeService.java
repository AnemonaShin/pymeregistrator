package com.pyme.pymeregistrator.service;

import java.util.List;

import com.pyme.pymeregistrator.request.AddPymeRequest;

public interface PymeService {

    public List<AddPymeRequest> addToList(AddPymeRequest body);
    
}
