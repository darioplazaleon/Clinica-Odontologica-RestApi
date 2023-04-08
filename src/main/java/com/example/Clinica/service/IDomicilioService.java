package com.example.Clinica.service;

import com.example.Clinica.dto.DomicilioDTO;

import java.util.Set;

public interface IDomicilioService {
    public void crearDomicilio(DomicilioDTO domicilioDTO);
    DomicilioDTO leerDomicilio(Long id);
    void  modificarDomicilio(DomicilioDTO domicilioDTO);
    void eliminarDomicilio(Long id);
    Set<DomicilioDTO> traerTodos();
}
