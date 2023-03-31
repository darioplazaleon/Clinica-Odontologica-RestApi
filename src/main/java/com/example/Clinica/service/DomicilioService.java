package com.example.Clinica.service;

import com.example.Clinica.dto.DomicilioDTO;
import com.example.Clinica.entity.Domicilio;
import com.example.Clinica.repository.IDomicilioRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class DomicilioService implements IDomicilioService {

    @Autowired
    IDomicilioRepository domicilioRepository;

    @Autowired
    ObjectMapper mapper;


    @Override
    public void crearDomicilio(DomicilioDTO domicilioDTO) {
        Domicilio domicilio = mapper.convertValue(domicilioDTO, Domicilio.class);
        domicilioRepository.save(domicilio);
    }

    @Override
    public DomicilioDTO leerDomicilio(Long id) {
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
        Domicilio domicilio = mapper.convertValue(domicilioDTO, Domicilio.class);
        domicilioRepository.save(domicilio);
    }

    @Override
    public void eliminarDomicilio(Long id) {
        domicilioRepository.deleteById(id);
    }

    @Override
    public Set<DomicilioDTO> traerTodos() {
        List<Domicilio> domicilios = domicilioRepository.findAll();
        Set<DomicilioDTO> domicilioDTOS = new HashSet<>();
        for (Domicilio domicilio: domicilios){
            domicilioDTOS.add(mapper.convertValue(domicilio, DomicilioDTO.class));
        }
        return domicilioDTOS;
    }
}
