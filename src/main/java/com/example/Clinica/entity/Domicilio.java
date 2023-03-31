package com.example.Clinica.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "domicilios")
@NoArgsConstructor
@AllArgsConstructor
public class Domicilio {

    @Id
    @SequenceGenerator(name = "domicilio_sequense", sequenceName = "domicilio_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "domicilio_sequence")
    private Long id;
    private String calle;
    private String localidad;
    private String provincia;
}
