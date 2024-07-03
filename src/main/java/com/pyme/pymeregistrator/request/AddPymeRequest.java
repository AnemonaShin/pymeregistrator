package com.pyme.pymeregistrator.request;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AddPymeRequest {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;

    String descripcion;
    
    String nombre;
    
    String rubro;
    
    String email;
    
    String fono;
    
    String comunaDelivery;

}
