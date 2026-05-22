package com.hospital.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hospital.entity.Paciente;

@Configuration
public class HospitalConfiguration {

    @Bean
    public Paciente pacienteCompleto() {

        Paciente paciente = new Paciente();
        paciente.setId(1L);
        paciente.setNome("João Gabriel");
        paciente.setCpf("12345678900");
        paciente.setTelefone("15999999999");

        return paciente;
    }
}