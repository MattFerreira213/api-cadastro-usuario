package com.itau.nttdata.api1.application.service;

import com.itau.nttdata.api1.application.domain.Usuario;
import com.itau.nttdata.api1.application.ports.UsuarioRepositoryPort;
import com.itau.nttdata.api1.application.ports.UsuarioServicePort;

import java.util.List;

public class UsuarioServiceImpl implements UsuarioServicePort {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public UsuarioServiceImpl(final UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }

    @Override
    public Usuario save(Usuario usuario) {
        usuario.setNome(usuario.getNome());
        usuario.setTipoDocumento(usuario.getTipoDocumento());
        usuario.setNumeroDocumento(usuario.getNumeroDocumento());
        usuario.setTipoSolicitacao(usuario.getTipoSolicitacao());
        usuario.setEndereco(usuario.getEndereco());

        return usuarioRepositoryPort.save(usuario);
    }

    @Override
    public List<Usuario> listAllUsers() {
        var usuarios = usuarioRepositoryPort.listAllUsers();
        return usuarios;
    }

    @Override
    public Usuario listUserByNumeroDeDocumento(String numeroDocumento) {
        var usuario = usuarioRepositoryPort.listUserByNumeroDeDocumento(numeroDocumento);
        return usuario;
    }


//
//    @Override
//    public Usuario update(Usuario usuario) {
//        return null;
//    }
}
