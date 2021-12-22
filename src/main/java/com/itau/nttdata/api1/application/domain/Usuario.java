package com.itau.nttdata.api1.application.domain;

import com.itau.nttdata.api1.application.domain.Enum.ETipoDeDocumento;
import com.itau.nttdata.api1.application.domain.Enum.ETipoDeSolicitacao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    private Long Id;
    private String nome;
    private ETipoDeDocumento tipoDeDocumento;
    private String numeroDeDocumento;
    private ETipoDeSolicitacao tipoDeSolicitacao;
    private String endereco;
}
