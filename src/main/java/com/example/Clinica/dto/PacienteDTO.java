package com.example.Clinica.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class PacienteDTO implements Serializable {
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private Date fechaIngreso;
}
