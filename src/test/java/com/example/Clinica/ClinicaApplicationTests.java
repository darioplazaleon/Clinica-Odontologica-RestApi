package com.example.Clinica;

import com.example.Clinica.dto.DomicilioDTO;
import com.example.Clinica.dto.OdontologoDTO;
import com.example.Clinica.dto.PacienteDTO;
import com.example.Clinica.dto.TurnoDTO;
import com.example.Clinica.service.IDomicilioService;
import com.example.Clinica.service.IOdontologoService;
import com.example.Clinica.service.IPacienteService;
import com.example.Clinica.service.ITurnoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class ClinicaApplicationTests {

	@Autowired
	private IOdontologoService odontologoService;

	@Autowired
	private IPacienteService pacienteService;

	@Autowired
	private IDomicilioService domicilioService;

	@Autowired
	private ITurnoService turnoService;

//	@Test
//	public void crearOdontologoTest(){
//		OdontologoDTO odontologoDTO = new OdontologoDTO();
//		odontologoDTO.setId(3L);
//		odontologoDTO.setApellido("Gomez");
//		odontologoDTO.setNombre("Dario");
//		odontologoDTO.setMatricula(115315135);
//		odontologoService.crearOdontologo(odontologoDTO);
//		OdontologoDTO odontologoDTO1 = odontologoService.leerOdontologo(3L);
//	}
//
//	@Test
//	public void crearPacienteTest(){
//		PacienteDTO pacienteDTO = new PacienteDTO();
//		pacienteDTO.setEmail("hola@hotmail.com");
//		pacienteDTO.setId(1L);
//		pacienteDTO.setApellido("Gomez");
//		pacienteDTO.setNombre("Maria");
//		pacienteService.crearPaciente(pacienteDTO);
//		PacienteDTO pacienteDTO1 = pacienteService.leerPaciente(1L);
//	}

//	@Test
//	public void crearDomicilioTest(){
//		DomicilioDTO domicilioDTO = new DomicilioDTO();
//		domicilioDTO.setId(2L);
//		domicilioDTO.setCalle("Emilio Castro");
//		domicilioDTO.setLocalidad("Liniers");
//		domicilioDTO.setProvincia("CABA");
//		domicilioService.crearDomicilio(domicilioDTO);
//		DomicilioDTO domicilioDTO1 = domicilioService.leerDomicilio(2L);
//	}

//	@Test
//	public void crearTestTest(){
//		TurnoDTO turnoDTO = new TurnoDTO();
//		turnoDTO.setId(1L);
//		turnoDTO.setFecha("2023-04-15");
//		turnoService.crearTurno(turnoDTO);
//		TurnoDTO turnoDTO1 = turnoService.leerTurno(1l);
//	}
}
