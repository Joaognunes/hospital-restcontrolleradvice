package com.hospital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entity.Paciente;

@RestController
public class BeanController {

    private final Paciente paciente;

    public BeanController(Paciente paciente) {
        this.paciente = paciente;
    }

    @GetMapping("/paciente")
    public Paciente exibirPaciente() {
        return paciente;
    }
}