package com.hospital.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hospital.entity.Prontuario;
import com.hospital.repository.ProntuarioRepository;

@Service
public class ProntuarioService {

    private final ProntuarioRepository repository;

    public ProntuarioService(ProntuarioRepository repository) {
        this.repository = repository;
    }

    public List<Prontuario> listar() {
        return repository.findAll();
    }
}