package com.itau.nttdata.api1.adapters.persistence;

import com.itau.nttdata.api1.adapters.persistence.entities.UsuarioEntity;
import com.itau.nttdata.api1.application.domain.Usuario;
import com.itau.nttdata.api1.application.ports.UsuarioRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class UsuarioRepository implements UsuarioRepositoryPort {

    private final SpringUsuarioRepository springUsuarioRepository;

    public UsuarioRepository(final SpringUsuarioRepository springUsuarioRepository) {
        this.springUsuarioRepository = springUsuarioRepository;
    }

    @Autowired
    ModelMapper modelMapper;

    @Override
    public Usuario save(Usuario usuario) {
        var usuarioEntity = springUsuarioRepository.save(modelMapper.map(usuario, UsuarioEntity.class));
        return modelMapper.map(usuarioEntity, Usuario.class);
    }

    @Override
    public List<Usuario> listAllUsers() {
        List<UsuarioEntity> usuarioEntis = springUsuarioRepository.findAll();
        List<Usuario> usuarios = new ArrayList(usuarioEntis);
        return usuarios;
    }

    @Override
    public Usuario listUserByNumeroDeDocumento(String numeroDeDocumento) {
        return null;
    }


}
