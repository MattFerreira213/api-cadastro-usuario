package com.itau.nttdata.api1.adapters.persistence.entities;

import com.itau.nttdata.api1.application.domain.Enum.ETipoDeDocumento;
import com.itau.nttdata.api1.application.domain.Enum.ETipoDeSolicitacao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioEntity {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nome;
    private ETipoDeDocumento tipoDocumento;
    private String numeroDocumento;
    private ETipoDeSolicitacao tipoSolicitacao;
    private String endereco;
}

