package com.itau.nttdata.api1.domain.service;

import com.itau.nttdata.api1.domain.Usuario;
import com.itau.nttdata.api1.domain.ports.UsuarioRepositoryPort;
import com.itau.nttdata.api1.domain.ports.UsuarioServicePort;

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

    @Override
    public Usuario update(Usuario usuario, String numeroDocumento) {
        var usuarioAtualizado = usuarioRepositoryPort.update(usuario, numeroDocumento);
        return usuarioAtualizado;
    }

}
