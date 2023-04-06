package com.example.Clinica.controller;


import com.example.Clinica.dto.PacienteDTO;
import com.example.Clinica.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    IPacienteService pacienteService;

    @PostMapping("/crear")
    public ResponseEntity<?> crearPaciente(@RequestBody PacienteDTO pacienteDTO){
        pacienteService.crearPaciente(pacienteDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public PacienteDTO leerPaciente(@PathVariable Long id){
        return pacienteService.leerPaciente(id);
    }

    @PutMapping("/modificar")
    public ResponseEntity<?> modificarPaciente(@RequestBody PacienteDTO pacienteDTO){
        pacienteService.modificarPaciente(pacienteDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarPaciente(@PathVariable Long id){
        ResponseEntity<String> response = null;
        pacienteService.eliminarPaciente(id);
        response = ResponseEntity.status(HttpStatus.OK).body("Eliminado");
        return response;
    }
}
