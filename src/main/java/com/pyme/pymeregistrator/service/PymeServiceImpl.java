package com.pyme.pymeregistrator.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pyme.pymeregistrator.request.AddPymeRequest;
import com.pyme.pymeregistrator.response.PymeInfoResponse;
import com.pyme.pymeregistrator.service.utils.ConstantsMsgs;
import com.pyme.pymeregistrator.service.utils.MethodUtils;

@Service
public class PymeServiceImpl implements PymeServiceInt{

    public PymeInfoResponse response = new PymeInfoResponse();
    public List<AddPymeRequest> pyme = new ArrayList<>();
    public ConstantsMsgs constants = new ConstantsMsgs();
    public MethodUtils utils = new MethodUtils();


    /**
     * Metodo usado para agregar informacion a lista.
     */
    public String addPyme(AddPymeRequest request) throws Exception {
      
        if (request.getId()==null){

            return "Hace falta ID para ingresar data.";
        } else {

            pyme.add(request); //Original guardado solo para testeo.
            //Temporal
            response.setId(request.getId());
            response.setDescripcion(request.getDescripcion());
            response.setNombre(request.getNombre());
            response.setRubro(request.getRubro());
            response.setEmail(request.getEmail());
            response.setFono(request.getFono());
            response.setComunaDelivery(request.getComunaDelivery());
            //Temporal

            return "Data ingresada correctamente.";

        }
        
    }

    /**
     * Metodo para listar toda la data de la lista solicitada.
     */
    public PymeInfoResponse actualPymeInfo() throws Exception {
        return response;
    }

    /**
     * Metodo para listar toda la data de la lista solicitada.
     * @TODO
     */
    @Override
    public List<PymeInfoResponse> pymeInfo() throws Exception {



        throw new UnsupportedOperationException("Unimplemented method 'pymeInfo'");
    }

    /**
     * Metodo para listar solo un dato segun id ingresado.
     */
    public PymeInfoResponse pymeInfo(String id) throws Exception{        
        
        try {
            PymeInfoResponse response = utils.getPymeDataById(id, pyme);

           return response;
        } catch(Exception e){
            throw new Exception(e.getMessage());
        }

    }

}
