package com.hospital.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.hospital.entity.Paciente;
import com.hospital.repository.PacienteRepository;

@Service
public class PacienteService {

    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public List<Paciente> listar() {
        return repository.findAll();
    }
}
