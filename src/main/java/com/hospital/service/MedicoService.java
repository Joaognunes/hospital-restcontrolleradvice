package com.hospital.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hospital.entity.Medico;
import com.hospital.repository.MedicoRepository;

@Service
public class MedicoService {

    private final MedicoRepository repository;

    public MedicoService(MedicoRepository repository) {
        this.repository = repository;
    }

    public List<Medico> listar() {
        return repository.findAll();
    }
}