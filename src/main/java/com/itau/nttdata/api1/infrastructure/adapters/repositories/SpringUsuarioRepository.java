package com.itau.nttdata.api1.infrastructure.adapters.repositories;

import com.itau.nttdata.api1.infrastructure.adapters.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringUsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    UsuarioEntity findByNumeroDocumento(String numeroDeDocumento);
}
