package com.example.Clinica.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Builder
@Data
@Entity
@Table(name = "pacientes")
@NoArgsConstructor
@AllArgsConstructor
public class Paciente implements Serializable {

    @Id
    @SequenceGenerator(name = "paciente_sequence", sequenceName = "paciente_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paciente_sequence")
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String dni;
    private String fechaIngreso;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private Set<Domicilio> domicilios;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Turno> turnos;
}
