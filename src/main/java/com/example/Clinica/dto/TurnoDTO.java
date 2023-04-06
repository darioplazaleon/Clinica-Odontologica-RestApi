package com.example.Clinica.dto;

import com.example.Clinica.entity.Odontologo;
import com.example.Clinica.entity.Paciente;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
public class TurnoDTO implements Serializable {
    private Long id;
    private String  fecha;
    private Odontologo odontologo;
    private Paciente paciente;
}
