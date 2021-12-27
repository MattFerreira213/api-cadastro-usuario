package com.itau.nttdata.api1.infrastructure.configuration;

import com.itau.nttdata.api1.domain.ports.UsuarioRepositoryPort;
import com.itau.nttdata.api1.domain.service.UsuarioServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    UsuarioServiceImpl usuarioService(UsuarioRepositoryPort repository){
        return new UsuarioServiceImpl(repository);
    }

    @Bean
    public ModelMapper modelMapper() {
        var modelMapper = new ModelMapper();
        return modelMapper;
    }
}
