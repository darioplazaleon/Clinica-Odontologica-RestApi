package com.example.Clinica.service.impl;

import com.example.Clinica.dto.PacienteDTO;
import com.example.Clinica.entity.Paciente;
import com.example.Clinica.repository.IPacienteRespository;
import com.example.Clinica.service.IPacienteService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PacienteService implements IPacienteService {

    private static final Logger logger = Logger.getLogger(PacienteService.class);

    @Autowired
    IPacienteRespository pacienteRespository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void crearPaciente(PacienteDTO pacienteDTO) {
        logger.info("Creando Paciente");
        Paciente paciente = mapper.convertValue(pacienteDTO, Paciente.class);
        pacienteRespository.save(paciente);
        logger.info("Paciente creado");
    }

    @Override
    public PacienteDTO leerPaciente(Long id) {
        logger.info("Buscando paciente con id: " + id);
        Optional<Paciente> paciente = pacienteRespository.findById(id);
        PacienteDTO pacienteDTO = null;
        if(paciente.isPresent()){
            pacienteDTO = mapper.convertValue(paciente, PacienteDTO.class);
            return pacienteDTO;
        }
        return null;
    }

    @Override
    public void modificarPaciente(PacienteDTO pacienteDTO) {
        logger.info("Modificando paciente");
        Paciente paciente = mapper.convertValue(pacienteDTO, Paciente.class);
        pacienteRespository.save(paciente);
        logger.info("Paciente modificado");
    }

    @Override
    public void eliminarPaciente(Long id) {
        logger.info("Eliminando paciente con id: " + id);
        pacienteRespository.deleteById(id);
        logger.info("Paciente eliminado");
    }

    @Override
    public Collection<PacienteDTO> traerTodosPacientes() {
        logger.info("Listando los pacientes");
        List<Paciente> pacientes = pacienteRespository.findAll();
        Set<PacienteDTO> pacienteDTOS = new HashSet<>();
        for (Paciente paciente: pacientes){
            pacienteDTOS.add(mapper.convertValue(paciente, PacienteDTO.class));
        }
        logger.info("Lista de pacientes creados");
        return pacienteDTOS;
    }
}
