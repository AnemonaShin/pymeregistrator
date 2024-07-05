package com.pyme.pymeregistrator.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.pyme.pymeregistrator.domain.MessageModel;
import com.pyme.pymeregistrator.request.AddPymeRequest;

public interface PymeService {

    public List<AddPymeRequest> addToList(AddPymeRequest body);
    
    public ResponseEntity<MessageModel> addToBd (AddPymeRequest body) throws Exception;

    public ResponseEntity<MessageModel> editInBd(Long id, AddPymeRequest body) throws Exception;

    public ResponseEntity<MessageModel> deleteInBdById (Long id) throws Exception;

    public Iterable<AddPymeRequest> searchInBd ();

    public Iterable<AddPymeRequest> searchByRubroInBD(String rubro);
}
