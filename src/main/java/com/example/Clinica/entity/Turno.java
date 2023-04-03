package com.example.Clinica.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "turnos")
@NoArgsConstructor
@AllArgsConstructor
public class Turno {

    @Id
    @SequenceGenerator(name = "turno_sequense", sequenceName = "turno_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "turno_sequence")
    private Long id;
    private String fecha;

}
