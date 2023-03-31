package com.example.Clinica.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "odontologos")
@NoArgsConstructor
@AllArgsConstructor
public class Odontologo {

    @Id
    @SequenceGenerator(name = "odontologo_sequense", sequenceName = "odontologo_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "odontologo_sequence")
    private Long id;
    private String nombre;
    private String apellido;
    private int matricula;
}
