package com.example.Clinica.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DomicilioDTO {
    private Long id;
    private String calle;
    private String localidad;
    private String provincia;
}
