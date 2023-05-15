package com.example.Clinica.service;

import com.example.Clinica.dto.PacienteDTO;

import java.util.Set;

public interface IPacienteService {
    void crearPaciente(PacienteDTO pacienteDTO);
    PacienteDTO leerPaciente(Long id);
    void modificarPaciente(PacienteDTO pacienteDTO);
    void eliminarPaciente(Long id);
    Set<PacienteDTO> traerTodosPacientes();
}
