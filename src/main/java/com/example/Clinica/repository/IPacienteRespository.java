package com.example.Clinica.repository;

import com.example.Clinica.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPacienteRespository extends JpaRepository<Paciente,Long> {
}
