package com.example.Clinica.controller;

import com.example.Clinica.dto.OdontologoDTO;
import com.example.Clinica.service.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    @Autowired
    IOdontologoService odontologoService;

    @PostMapping("/crear")
    public ResponseEntity<?> crearOdontologo(@RequestBody OdontologoDTO odontologoDTO){
        odontologoService.crearOdontologo(odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public OdontologoDTO leerOdontologo(@PathVariable Long id){
        return odontologoService.leerOdontologo(id);
    }

    @PutMapping("/modificar")
    public ResponseEntity<?> modificarOdontologo(@RequestBody OdontologoDTO odontologoDTO){
        odontologoService.modificarOdontologo(odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable Long id){
        ResponseEntity<String> response = null;
        odontologoService.eliminarOdontolo(id);
        response = ResponseEntity.status(HttpStatus.OK).body("Eliminado");
        return response;
    }
}
