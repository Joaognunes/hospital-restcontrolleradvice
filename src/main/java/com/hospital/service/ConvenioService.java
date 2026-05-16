package com.hospital.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.hospital.entity.Convenio;
import com.hospital.repository.ConvenioRepository;

@Service
public class ConvenioService {

    private final ConvenioRepository repository;

    public ConvenioService(ConvenioRepository repository) {
        this.repository = repository;
    }

    public List<Convenio> listar() {
        return repository.findAll();
    }
}
