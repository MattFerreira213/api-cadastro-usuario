package com.itau.nttdata.api1.domain.ports;

import com.itau.nttdata.api1.domain.Usuario;

import java.util.List;

public interface UsuarioRepositoryPort {

    Usuario save(Usuario usuario);
    List<Usuario> listAllUsers();
    Usuario listUserByNumeroDeDocumento(String numeroDocumento);
    Usuario update(Usuario usuario, String numeroDocumento);
}
