package com.itau.nttdata.api1.domain;

import com.itau.nttdata.api1.domain.Enum.ETipoDeDocumento;
import com.itau.nttdata.api1.domain.Enum.ETipoDeSolicitacao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    private Long Id;
    private String nome;
    private ETipoDeDocumento tipoDocumento;
    private String numeroDocumento;
    private ETipoDeSolicitacao tipoSolicitacao;
    private String endereco;
}
