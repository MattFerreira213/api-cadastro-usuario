package com.itau.nttdata.api1.adapters.persistence;

import com.itau.nttdata.api1.adapters.persistence.entities.UsuarioEntity;
import com.itau.nttdata.api1.application.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringUsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
//    Usuario findByNumeroDoDocumento(String numeroDoDocumento);
}
