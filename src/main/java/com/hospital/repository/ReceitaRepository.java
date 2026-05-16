package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.entity.Receita;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {
}
