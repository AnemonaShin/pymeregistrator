package com.pyme.pymeregistrator.service.utils;

import java.util.List;

import com.pyme.pymeregistrator.request.AddPymeRequest;
import com.pyme.pymeregistrator.response.PymeInfoResponse;

public class MethodUtils {
    PymeInfoResponse response = new PymeInfoResponse();
    PymeInfoResponse responseI = new PymeInfoResponse();

    public List<PymeInfoResponse> getAllPymeData(List<AddPymeRequest> pyme) throws Exception{
        
        
        
        return null;
    }

    public PymeInfoResponse getPymeDataById(String id, List<AddPymeRequest> pyme) throws Exception{

        try {
            pyme.forEach(f->{
                
                if(id.equals(f.getId())){
                    responseI = new PymeInfoResponse(f.getId(), f.getDescripcion(), f.getNombre(), f.getRubro(), f.getEmail(), f.getFono(), f.getComunaDelivery());
                } else {
                    return;
                }
                response = responseI;
            });
    
            return response;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
        
    }
}
