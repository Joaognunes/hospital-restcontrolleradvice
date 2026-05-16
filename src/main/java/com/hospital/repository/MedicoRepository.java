package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.entity.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
