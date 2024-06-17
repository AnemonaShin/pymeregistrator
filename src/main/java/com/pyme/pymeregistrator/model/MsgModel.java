package com.pyme.pymeregistrator.model;

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
public class MsgModel {
    
    private String code;
    private String message;

}
