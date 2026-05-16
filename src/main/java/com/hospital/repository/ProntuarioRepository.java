package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.entity.Prontuario;

public interface ProntuarioRepository extends JpaRepository<Prontuario, Long> {
}
