package com.example.Clinica.service;

import com.example.Clinica.dto.OdontologoDTO;
import com.example.Clinica.dto.TurnoDTO;

import java.util.Set;

public interface ITurnoService {
    void crearTurno(TurnoDTO turnoDTO);
    TurnoDTO leerTurno(Long id);
    void modificarTurno(TurnoDTO turnoDTO);
    void eliminarTurno(Long id);
    Set<TurnoDTO> traerTodos();
}
