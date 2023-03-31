package com.example.Clinica.repository;

import com.example.Clinica.entity.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo, Long> {
    @Query("SELECT e from Odontologo e WHERE e.apellido LIKE %:apellido%")
    Set<Odontologo> obtenerOdontologoApellido(@Param("apellido") String apellido);

}
