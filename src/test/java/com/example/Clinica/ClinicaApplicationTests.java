package com.example.Clinica;

import com.example.Clinica.dto.OdontologoDTO;
import com.example.Clinica.dto.PacienteDTO;
import com.example.Clinica.service.IOdontologoService;
import com.example.Clinica.service.IPacienteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClinicaApplicationTests {

	@Autowired
	private IOdontologoService odontologoService;

	@Autowired
	private IPacienteService pacienteService;

	@Test
	public void crearOdontologoTest(){
		OdontologoDTO odontologoDTO = new OdontologoDTO();
		odontologoDTO.setId(2L);
		odontologoDTO.setApellido("Garcia");
		odontologoDTO.setNombre("Dario");
		odontologoDTO.setMatricula(56456456);
		odontologoService.crearOdontologo(odontologoDTO);
		OdontologoDTO odontologoDTO1 = odontologoService.leerOdontologo(2L);
	}

	@Test
	public void crearPacienteTest(){
		PacienteDTO pacienteDTO = new PacienteDTO();
		pacienteDTO.setEmail("hola@hotmail.com");
		pacienteDTO.setId(1L);
		pacienteDTO.setApellido("Gomez");
		pacienteDTO.setNombre("Maria");
		pacienteService.crearPaciente(pacienteDTO);
		PacienteDTO pacienteDTO1 = pacienteService.leerPaciente(1L);
	}

}
