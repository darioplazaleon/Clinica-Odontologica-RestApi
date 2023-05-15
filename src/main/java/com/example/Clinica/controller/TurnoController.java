package com.example.Clinica.controller;

import com.example.Clinica.dto.OdontologoDTO;
import com.example.Clinica.dto.TurnoDTO;
import com.example.Clinica.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    @Autowired
    ITurnoService turnoService;

    @GetMapping("/listar")
    public Collection<TurnoDTO> traerTodos(){
        return turnoService.traerTodos();
    }

    @PostMapping("/crear")
    public ResponseEntity<?> crearTurno(@RequestBody TurnoDTO turnoDTO){
        turnoService.crearTurno(turnoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public TurnoDTO leerTurno(@PathVariable Long id){
        return turnoService.leerTurno(id);
    }

    @PutMapping("/modificar")
    public ResponseEntity<?> modificarTurno(@RequestBody TurnoDTO turnoDTO){
        turnoService.modificarTurno(turnoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarTurno(@PathVariable Long id){
        ResponseEntity<String> response = null;
        turnoService.eliminarTurno(id);
        response = ResponseEntity.status(HttpStatus.OK).body("Eliminado");
        return response;
    }


}
