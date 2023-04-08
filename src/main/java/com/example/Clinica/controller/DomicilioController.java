package com.example.Clinica.controller;

import com.example.Clinica.dto.DomicilioDTO;
import com.example.Clinica.dto.OdontologoDTO;
import com.example.Clinica.service.IDomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController {

    @Autowired
    IDomicilioService domicilioService;

    @PostMapping("/crear")
    public ResponseEntity<?> crearDomicilio(@RequestBody DomicilioDTO domicilioDTO){
        domicilioService.crearDomicilio(domicilioDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public DomicilioDTO leerDomicilio(@PathVariable Long id){
        return domicilioService.leerDomicilio(id);
    }

    @PutMapping("/modificar")
    public ResponseEntity<?> modificarDomicilio(@RequestBody DomicilioDTO domicilioDTO){
        domicilioService.modificarDomicilio(domicilioDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarDomicilio(@PathVariable Long id){
        ResponseEntity<String> response = null;
        domicilioService.eliminarDomicilio(id);
        response = ResponseEntity.status(HttpStatus.OK).body("Eliminado");
        return response;
    }
}
