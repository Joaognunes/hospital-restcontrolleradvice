package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.entity.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
