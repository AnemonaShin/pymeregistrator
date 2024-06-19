package com.pyme.pymeregistrator.model;

import io.micrometer.common.lang.NonNullFields;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Para respuestas basicas.
 * @author Christian Ramirez
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@NonNullFields
public class MsgModel {
    
    private String code;
    private String message;

}
