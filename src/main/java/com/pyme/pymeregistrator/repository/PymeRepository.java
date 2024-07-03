package com.pyme.pymeregistrator.repository;

import org.springframework.data.repository.CrudRepository;

import com.pyme.pymeregistrator.request.AddPymeRequest;

public interface PymeRepository extends CrudRepository<AddPymeRequest, Long>{

}
