package com.example.Clinica.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class OdontologoDTO implements Serializable {
    private Long id;
    private String nombre;
    private String apellido;
    private int matricula;
}
