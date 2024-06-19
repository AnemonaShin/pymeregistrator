package com.pyme.pymeregistrator.response;

import com.pyme.pymeregistrator.model.MsgModel;

import io.micrometer.common.lang.NonNullFields;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@NonNullFields
public class PymeInfoResponse extends MsgModel{
    
    String id;
    String descripcion;
    String nombre;
    String rubro;
    String email;
    String fono;
    String comunaDelivery;

}
