package com.itau.nttdata.api1.adapters.persistence;

import com.itau.nttdata.api1.adapters.persistence.entities.UsuarioEntity;
import com.itau.nttdata.api1.application.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringUsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    UsuarioEntity findByNumeroDocumento(String numeroDeDocumento);
}
