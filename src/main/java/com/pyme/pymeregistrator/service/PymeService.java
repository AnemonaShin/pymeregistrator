package com.pyme.pymeregistrator.service;

import java.util.List;

import com.pyme.pymeregistrator.domain.MessageModel;
import com.pyme.pymeregistrator.request.AddPymeRequest;

public interface PymeService {

    public List<AddPymeRequest> addToList(AddPymeRequest body);
    
    public MessageModel addToBd (AddPymeRequest body) throws Exception;

    public Iterable<AddPymeRequest> SearchInBd ();
}
