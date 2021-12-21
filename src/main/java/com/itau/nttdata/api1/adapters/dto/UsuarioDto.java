package com.itau.nttdata.api1.adapters.dto;

import com.itau.nttdata.api1.application.domain.Enum.ETipoDeDocumento;
import com.itau.nttdata.api1.application.domain.Enum.ETipoDeSolicitacao;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UsuarioDto {

    @NotBlank
    private String nome;

    @NotNull
    private ETipoDeDocumento tipoDeDocumento;

    @NotBlank
    private String numeroDeDocumento;

    @NotNull
    private ETipoDeSolicitacao tipoDeSolicitacao;

    @NotBlank
    private String endereco;
}
