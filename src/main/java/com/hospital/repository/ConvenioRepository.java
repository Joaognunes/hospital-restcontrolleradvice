package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.entity.Convenio;

public interface ConvenioRepository extends JpaRepository<Convenio, Long> {
}
