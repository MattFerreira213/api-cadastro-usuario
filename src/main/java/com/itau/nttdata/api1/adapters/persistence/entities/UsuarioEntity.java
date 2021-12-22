package com.itau.nttdata.api1.adapters.persistence.entities;

import com.itau.nttdata.api1.application.domain.Enum.ETipoDeDocumento;
import com.itau.nttdata.api1.application.domain.Enum.ETipoDeSolicitacao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nome;
    private ETipoDeDocumento tipoDeDocumento;
    private String numeroDeDocumento;
    private ETipoDeSolicitacao tipoDeSolicitacao;
    private String endereco;
}
