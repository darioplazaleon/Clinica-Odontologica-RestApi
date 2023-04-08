package com.example.Clinica.service.impl;

import com.example.Clinica.dto.OdontologoDTO;
import com.example.Clinica.entity.Odontologo;
import com.example.Clinica.repository.IOdontologoRepository;
import com.example.Clinica.service.IOdontologoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;

import java.util.*;

@Service
public class OdontologoService implements IOdontologoService {

    private static final Logger logger = Logger.getLogger(OdontologoService.class);

    @Autowired
    IOdontologoRepository odontologoRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void crearOdontologo(OdontologoDTO odontologoDTO) {
        logger.info("Creando Odontologo");
        Odontologo odontologo = mapper.convertValue(odontologoDTO, Odontologo.class);
        odontologoRepository.save(odontologo);
        logger.info("Odontologo creado");
    }

    @Override
    public OdontologoDTO leerOdontologo(Long id) {
        logger.info("Buscando odontologo con id: " + id);
        Optional<Odontologo> odontologo = odontologoRepository.findById(id);
        OdontologoDTO odontologoDTO = null;
        if (odontologo.isPresent()){
            odontologoDTO = mapper.convertValue(odontologo, OdontologoDTO.class);
            return odontologoDTO;
        }
        return null;
    }

    @Override
    public void modificarOdontologo(OdontologoDTO odontologoDTO) {
        logger.info("Modificando odontologo");
        Odontologo odontologo = mapper.convertValue(odontologoDTO, Odontologo.class);
        odontologoRepository.save(odontologo);
    }

    @Override
    public void eliminarOdontolo(Long id) {
        logger.info("Eliminando odontologo");
        odontologoRepository.deleteById(id);
        logger.info("Odontologo eliminado");
    }

    @Override
    public Collection<OdontologoDTO> traerTodos() {
        logger.info("Creando lista de odontologos");
        List<Odontologo> odontologos = odontologoRepository.findAll();
        Set<OdontologoDTO> odontologoDTOS = new HashSet<>();
        for (Odontologo odontologo: odontologos){
            odontologoDTOS.add((mapper.convertValue(odontologo, OdontologoDTO.class)));
        }
        logger.info("Lista de odontologos creada");
        return odontologoDTOS;
    }
}
