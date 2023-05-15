package com.example.Clinica.repository;

import com.example.Clinica.entity.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ITurnoRepository extends JpaRepository<Turno, Long> {
}
