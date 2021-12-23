package com.itau.nttdata.api1.application.ports;

import com.itau.nttdata.api1.application.domain.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioServicePort {

    Usuario save(Usuario usuario);
    List<Usuario> listAllUsers();
    Usuario listUserByNumeroDeDocumento(String numeroDocumento);
//    Usuario update(Usuario usuario, String numeroDeDocumento);
}
