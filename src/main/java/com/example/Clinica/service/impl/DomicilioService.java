package com.example.Clinica.service.impl;

import com.example.Clinica.dto.DomicilioDTO;
import com.example.Clinica.entity.Domicilio;
import com.example.Clinica.repository.IDomicilioRepository;
import com.example.Clinica.service.IDomicilioService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class DomicilioService implements IDomicilioService {

    private static final Logger logger = Logger.getLogger(DomicilioService.class);

    @Autowired
    IDomicilioRepository domicilioRepository;

    @Autowired
    ObjectMapper mapper;


    @Override
    public void crearDomicilio(DomicilioDTO domicilioDTO) {
        logger.info("Creando domicilio");
        Domicilio domicilio = mapper.convertValue(domicilioDTO, Domicilio.class);
        domicilioRepository.save(domicilio);
        logger.info("Domicilio creado");
    }

    @Override
    public DomicilioDTO leerDomicilio(Long id) {
        logger.info("Buscando domicilio con id: " + id);
        Optional<Domicilio> domicilio = domicilioRepository.findById(id);
        DomicilioDTO domicilioDTO = null;
        if(domicilio.isPresent()){
            domicilioDTO = mapper.convertValue(domicilio, DomicilioDTO.class);
            return domicilioDTO;
        }
        return null;
    }

    @Override
    public void modificarDomicilio(DomicilioDTO domicilioDTO) {
        logger.info("Modificando domicilio");
        Domicilio domicilio = mapper.convertValue(domicilioDTO, Domicilio.class);
        domicilioRepository.save(domicilio);
    }

    @Override
    public void eliminarDomicilio(Long id) {
        logger.info("Eliminando domicilio con id: " + id);
        domicilioRepository.deleteById(id);
    }

    @Override
    public Set<DomicilioDTO> traerTodos() {
        logger.info("Listando domicilios");
        List<Domicilio> domicilios = domicilioRepository.findAll();
        Set<DomicilioDTO> domicilioDTOS = new HashSet<>();
        for (Domicilio domicilio: domicilios){
            domicilioDTOS.add(mapper.convertValue(domicilio, DomicilioDTO.class));
        }
        logger.info("Lista de domicilios creada");
        return domicilioDTOS;
    }
}
