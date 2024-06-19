package com.pyme.pymeregistrator.service;

import org.springframework.stereotype.Service;

import com.pyme.pymeregistrator.model.MsgModel;
import com.pyme.pymeregistrator.request.AddPymeRequest;
import com.pyme.pymeregistrator.response.PymeInfoResponse;
import com.pyme.pymeregistrator.service.utils.ConstantsMsgs;

@Service
public class PymeServiceImpl implements PymeServiceInt{

    public MsgModel msg;
    public PymeInfoResponse response = new PymeInfoResponse();
    public ConstantsMsgs constants = new ConstantsMsgs();

    public MsgModel addPyme(AddPymeRequest request) throws Exception {
      
        msg = new MsgModel();
        if (request.getId()==null){

            msg.setCode(constants.getEc3());
            msg.setMessage(constants.getEm3());
        
        } else {

            response.setId(request.getId());
            response.setDescripcion(request.getDescripcion());
            response.setNombre(request.getNombre());
            response.setRubro(request.getRubro());
            response.setEmail(request.getRubro());
            response.setFono(request.getEmail());
            response.setComunaDelivery(request.getComunaDelivery());

            msg.setCode(constants.getSc1());
            msg.setMessage(constants.getSm1());
        }
        
        return msg;
    }

    public PymeInfoResponse pymeInfo(String id) throws Exception{

        PymeInfoResponse response2 = new PymeInfoResponse();
        

        try {

            if (id.isEmpty()||response.getId() == null) {
                response2.setCode(constants.getEc2());
                response2.setMessage(constants.getEm2());
                return response2;
            } else if (id.equalsIgnoreCase(response.getId())) {
                response.setCode(constants.getSc2());
                response.setMessage(constants.getSm2());
                return response;
            } else {
                response2 = new PymeInfoResponse();
                response2.setCode(constants.getEc1());
                response2.setMessage(constants.getEm1());
                return response2;
            }
        } catch (Exception e){
            response2.setCode(constants.getEcs());
            response2.setMessage(constants.getEms());
            return response2;
        }

    }
    

    

}
