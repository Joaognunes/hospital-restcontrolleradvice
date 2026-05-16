package com.hospital.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.hospital.entity.Receita;
import com.hospital.repository.ReceitaRepository;

@Service
public class ReceitaService {

    private final ReceitaRepository repository;

    public ReceitaService(ReceitaRepository repository) {
        this.repository = repository;
    }

    public List<Receita> listar() {
        return repository.findAll();
    }
}
