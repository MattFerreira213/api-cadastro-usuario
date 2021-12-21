package com.itau.nttdata.api1.adapters.repositories;

import com.itau.nttdata.api1.application.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringUsuarioRepository extends JpaRepository<Usuario, Long> {
}
