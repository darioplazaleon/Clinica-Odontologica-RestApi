package com.example.Clinica.service;

import com.example.Clinica.dto.PacienteDTO;
import com.example.Clinica.entity.Paciente;
import com.example.Clinica.repository.IPacienteRespository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PacienteService implements IPacienteService {

    @Autowired
    IPacienteRespository pacienteRespository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void crearPaciente(PacienteDTO pacienteDTO) {
        Paciente paciente = mapper.convertValue(pacienteDTO, Paciente.class);
        pacienteRespository.save(paciente);
    }

    @Override
    public PacienteDTO leerPaciente(Long id) {
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
        Paciente paciente = mapper.convertValue(pacienteDTO, Paciente.class);
        pacienteRespository.save(paciente);
    }

    @Override
    public void eliminarPaciente(Long id) {
        pacienteRespository.deleteById(id);
    }

    @Override
    public Set<PacienteDTO> traerTodosPacientes() {
        List<Paciente> pacientes = pacienteRespository.findAll();
        Set<PacienteDTO> pacienteDTOS = new HashSet<>();
        for (Paciente paciente: pacientes){
            pacienteDTOS.add(mapper.convertValue(paciente, PacienteDTO.class));
        }
        return pacienteDTOS;
    }
}
