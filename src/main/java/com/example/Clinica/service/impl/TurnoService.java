package com.example.Clinica.service.impl;

import com.example.Clinica.dto.TurnoDTO;
import com.example.Clinica.entity.Turno;
import com.example.Clinica.repository.ITurnoRepository;
import com.example.Clinica.service.ITurnoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TurnoService implements ITurnoService {

    private static final Logger logger = Logger.getLogger(TurnoService.class);

    @Autowired
    ITurnoRepository turnoRepository;

    @Autowired
    ObjectMapper mapper;


    @Override
    public void crearTurno(TurnoDTO turnoDTO) {
        logger.info("Creando turno");
        Turno turno = mapper.convertValue(turnoDTO, Turno.class);
        turnoRepository.save(turno);
        logger.info("Turno creado");
    }

    @Override
    public TurnoDTO leerTurno(Long id) {
        logger.info("Buscando turno con id: " + id);
        Optional<Turno> turno = turnoRepository.findById(id);
        TurnoDTO turnoDTO = null;
        if (turno.isPresent()){
            turnoDTO = mapper.convertValue(turno, TurnoDTO.class);
            return turnoDTO;
        }
        return null;
    }

    @Override
    public void modificarTurno(TurnoDTO turnoDTO) {
        logger.info("Modificando turno");
        Turno turno = mapper.convertValue(turnoDTO, Turno.class);
        turnoRepository.save(turno);
    }

    @Override
    public void eliminarTurno(Long id) {
        logger.info("Eliminando turno con id: " + id);
        turnoRepository.deleteById(id);
    }

    @Override
    public Collection<TurnoDTO> traerTodos() {
        logger.info("Listando todos los turnos");
        List<Turno> turnos = turnoRepository.findAll();
        Set<TurnoDTO> turnoDTOS = new HashSet<>();
        for (Turno turno: turnos){
            turnoDTOS.add(mapper.convertValue(turno, TurnoDTO.class));
        }
        logger.info("Lista de turnos creada");
        return turnoDTOS;
    }
}
