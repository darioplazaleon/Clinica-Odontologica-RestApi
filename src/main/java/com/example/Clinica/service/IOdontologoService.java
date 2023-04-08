package com.example.Clinica.service;

import com.example.Clinica.dto.OdontologoDTO;

import java.util.Collection;
import java.util.Set;

public interface IOdontologoService {
    void crearOdontologo(OdontologoDTO odontologoDTO);
    OdontologoDTO leerOdontologo(Long id);
    void modificarOdontologo(OdontologoDTO odontologoDTO);
    void eliminarOdontolo(Long id);
    Collection<OdontologoDTO> traerTodos();
}
