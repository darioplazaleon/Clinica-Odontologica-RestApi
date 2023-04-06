package com.example.Clinica.dto;

import com.example.Clinica.entity.Paciente;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class DomicilioDTO implements Serializable {
    private Long id;
    private String calle;
    private String numero;
    private String localidad;
    private String provincia;
    private Paciente paciente;
}
