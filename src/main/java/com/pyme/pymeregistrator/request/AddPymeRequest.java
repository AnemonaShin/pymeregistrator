package com.pyme.pymeregistrator.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddPymeRequest {
    
    String pymeCode;
    String descripcion;
    String nombre;
    String rubro;
    String email;
    String fono;
    String comunaDelivery;

}
