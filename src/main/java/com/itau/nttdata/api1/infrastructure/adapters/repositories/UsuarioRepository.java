package com.itau.nttdata.api1.infrastructure.adapters.repositories;


import com.itau.nttdata.api1.infrastructure.adapters.entities.UsuarioEntity;
import com.itau.nttdata.api1.domain.Usuario;
import com.itau.nttdata.api1.domain.ports.UsuarioRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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
    public Usuario listUserByNumeroDeDocumento(String numeroDocumento){
        var usuarioEnty = springUsuarioRepository.findByNumeroDocumento(numeroDocumento);
        return modelMapper.map(usuarioEnty, Usuario.class);
    }

    @Override
    public Usuario update(Usuario usuario, String numeroDocumento) {
        var usuarioEnty = springUsuarioRepository.findByNumeroDocumento(numeroDocumento);
        usuarioEnty.setNome(usuario.getNome());
        usuarioEnty.setTipoDocumento(usuario.getTipoDocumento());
        usuarioEnty.setNumeroDocumento(usuario.getNumeroDocumento());
        usuarioEnty.setTipoSolicitacao(usuario.getTipoSolicitacao());
        usuarioEnty.setEndereco(usuario.getEndereco());
        springUsuarioRepository.save(usuarioEnty);
        return modelMapper.map(usuarioEnty, Usuario.class);
    }


}
