package com.pyme.pymeregistrator.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pyme.pymeregistrator.domain.MessageModel;
import com.pyme.pymeregistrator.repository.PymeRepository;
import com.pyme.pymeregistrator.request.AddPymeRequest;

@Service
public class PymeServiceImpl implements PymeService{

    @Autowired
    PymeRepository bdRepo;

    List<AddPymeRequest> listToAdd = new ArrayList<>();

    public List<AddPymeRequest> addToList(AddPymeRequest body) {

        listToAdd.add(body);

        return listToAdd;
    }

    public ResponseEntity<MessageModel> addToBd(AddPymeRequest body) throws Exception{

        try{
            
            if (body == null){
                throw new Exception("Data vacia.");
            } else {
                bdRepo.save(body);

                //return new MessageModel("00","Pyme ingresada correctamente.");
                return new ResponseEntity<MessageModel>(new MessageModel("00","Pyme ingresada correctamente."), HttpStatus.CREATED);
            }
            

        } catch(Exception e){
            throw new Exception(e.getMessage());
        }

    }

    public ResponseEntity<MessageModel> editInBd(Long id, AddPymeRequest body) throws Exception {

        bdRepo.update(id, body.getDescripcion(), body.getNombre(), body.getRubro(), body.getEmail(), body.getFono(), body.getComunaDelivery());

        return new ResponseEntity<MessageModel>(new MessageModel("00","Pyme modificada correctamente."), HttpStatus.OK);
    }

    public ResponseEntity<MessageModel> deleteInBdById(Long id) throws Exception {
        try{

            if (bdRepo.findById(id).isEmpty()){


                //return new MessageModel("01","No existe pyme con ese ID.");
                return new ResponseEntity<MessageModel>(new MessageModel("01","No existe Pyme con este ID."), HttpStatus.NOT_FOUND);
            } else {
                
                bdRepo.deleteById(id);

                //return new MessageModel("00","Pyme eliminada correctamente.");
                return new ResponseEntity<MessageModel>(new MessageModel("0","Pyme eliminada correctamente."), HttpStatus.OK);
            }

        } catch(Exception e){
            throw new Exception(e.getMessage());
        }

    }

    public Iterable<AddPymeRequest> SearchInBd() {
        return bdRepo.findAll();
    }
}
