package com.pyme.pymeregistrator.service;

import org.springframework.stereotype.Service;

import com.pyme.pymeregistrator.model.MsgModel;
import com.pyme.pymeregistrator.request.AddPymeRequest;
import com.pyme.pymeregistrator.response.PymeInfoResponse;

@Service
public class PymeServiceImpl implements PymeServiceInt{

    public MsgModel msg;
    public PymeInfoResponse response;


    public MsgModel addPyme(AddPymeRequest request) throws Exception {
      
        msg.setCode("null"); msg.setMessage("null");

        return msg;
    }

    public PymeInfoResponse pymeInfo(String id) throws Exception {

        return response;

    }
    

    

}
