package com.example.Clinica.service;

import com.example.Clinica.dto.DomicilioDTO;
import com.example.Clinica.dto.OdontologoDTO;

import java.util.Set;

public interface IDomicilioService {
    void crearDomicilio(DomicilioDTO domicilioDTO);
    DomicilioDTO leerDomicilio(Long id);
    void modificarDomicilio(DomicilioDTO domicilioDTO);
    void eliminarDomicilio(Long id);
    Set<DomicilioDTO> traerTodos();
}
