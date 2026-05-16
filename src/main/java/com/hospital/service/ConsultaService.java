package com.hospital.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.hospital.entity.Consulta;
import com.hospital.repository.ConsultaRepository;

@Service
public class ConsultaService {

    private final ConsultaRepository repository;

    public ConsultaService(ConsultaRepository repository) {
        this.repository = repository;
    }

    public List<Consulta> listar() {
        return repository.findAll();
    }
}
