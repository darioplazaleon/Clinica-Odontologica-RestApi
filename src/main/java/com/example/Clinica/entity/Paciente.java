package com.example.Clinica.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "pacientes")
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    @Id
    @SequenceGenerator(name = "paciente_sequense", sequenceName = "paciente_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paciente_sequence")
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String dni;
    private Date fechaIngreso;
}
