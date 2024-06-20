package com.pyme.pymeregistrator.service;

import java.util.List;

import com.pyme.pymeregistrator.request.AddPymeRequest;
import com.pyme.pymeregistrator.response.PymeInfoResponse;


public interface PymeServiceInt {
    
    public String addPyme(AddPymeRequest request) throws Exception; //Agregar datos a Lista.
    
    public PymeInfoResponse actualPymeInfo() throws Exception;

    public List<PymeInfoResponse> pymeInfo() throws Exception; //Listar todos los datos desde una lista que se auto almacena.
    public PymeInfoResponse pymeInfo(String id) throws Exception; //Listar un dato por id
    

}
