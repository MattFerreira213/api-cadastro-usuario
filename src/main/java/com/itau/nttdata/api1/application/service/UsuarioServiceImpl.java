package com.itau.nttdata.api1.application.service;

import com.itau.nttdata.api1.application.domain.Usuario;
import com.itau.nttdata.api1.application.ports.UsuarioRepositoryPort;
import com.itau.nttdata.api1.application.ports.UsuarioServicePort;

import java.util.List;
import java.util.Optional;

public class UsuarioServiceImpl implements UsuarioServicePort {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public UsuarioServiceImpl(final UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }

    @Override
    public Usuario save(Usuario usuario) {
        usuario.setNome(usuario.getNome());
        usuario.setTipoDeDocumento(usuario.getTipoDeDocumento());
        usuario.setNumeroDeDocumento(usuario.getNumeroDeDocumento());
        usuario.setTipoDeSolicitacao(usuario.getTipoDeSolicitacao());
        usuario.setEndereco(usuario.getEndereco());

        return usuarioRepositoryPort.save(usuario);
    }

    @Override
    public List<Usuario> listAllUsers() {
        List<Usuario> usuarios = usuarioRepositoryPort.listAllUsers();
        return usuarios;
    }

    @Override
    public Usuario listUserByNumeroDeDocumento(String numeroDeDocumento) {
        return null;
    }


//
//    @Override
//    public Usuario update(Usuario usuario) {
//        return null;
//    }
}
