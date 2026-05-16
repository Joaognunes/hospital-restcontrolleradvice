package com.hospital.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entity.Convenio;
import com.hospital.service.ConvenioService;

@RestController
@RequestMapping("/convenios")
public class ConvenioController {

    private final ConvenioService service;

    public ConvenioController(ConvenioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Convenio> listar() {
        return service.listar();
    }
}
