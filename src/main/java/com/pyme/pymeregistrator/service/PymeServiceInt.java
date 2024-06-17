package com.pyme.pymeregistrator.service;

import com.pyme.pymeregistrator.model.MsgModel;
import com.pyme.pymeregistrator.request.AddPymeRequest;
import com.pyme.pymeregistrator.response.PymeInfoResponse;

public interface PymeServiceInt {
    
    public MsgModel addPyme(AddPymeRequest request) throws Exception;
    public PymeInfoResponse pymeInfo(String id) throws Exception;

}
