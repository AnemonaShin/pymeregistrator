package com.pyme.pymeregistrator.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PymeInfoResponse {
    
    String pymeCode;
    String descripcion;
    String nombre;
    String rubro;
    String email;
    String fono;
    String comunaDelivery;

}
