package com.pyme.pymeregistrator.response;

import io.micrometer.common.lang.NonNullFields;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@NonNullFields
public class PymeInfoResponse{
    
    String id;
    String descripcion;
    String nombre;
    String rubro;
    String email;
    String fono;
    String comunaDelivery;

}
