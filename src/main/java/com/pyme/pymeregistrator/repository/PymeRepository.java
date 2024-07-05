package com.pyme.pymeregistrator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.pyme.pymeregistrator.request.AddPymeRequest;


public interface PymeRepository extends CrudRepository<AddPymeRequest, Long>{

    @Modifying
    @Transactional
    @Query("UPDATE AddPymeRequest SET descripcion=:descripcion, nombre=:nombre, rubro=:rubro, email=:email, fono=:fono, comunaDelivery=:comunaDelivery WHERE id=:id")
    public void update(@Param("id") Long id, @Param("descripcion") String descripcion, @Param("nombre") String nombre, @Param("rubro") String rubro, @Param("email") String email, @Param("fono") String fono, @Param("comunaDelivery") String comunaDelivery);

    public List<AddPymeRequest> findByRubro(String rubro);

}
