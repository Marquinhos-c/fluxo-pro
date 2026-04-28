package br.marcos.agenda.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "funcionario_servico")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class FuncionarioServico {

    /**
     * Entity que representa a tabela de relacionamento entre
     * Funcionario e Servico (N:N).
     *
     * Essa tabela diz:
     * "Quais serviços um funcionário pode realizar"
     */
    @EmbeddedId
    private FuncionarioServicoId id = new FuncionarioServicoId();

    /**
     * Relacionamento com Funcionario
     *
     * @MapsId("funcionarioId") → conecta com o campo dentro do ID
     * Isso faz com que:
     * id.funcionarioId = funcionario.getId()
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("funcionarioId")
    @JoinColumn(name = "funcionario_id", nullable = false)
    private Funcionario funcionario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("servicoId")
    @JoinColumn(name = "servico_id", nullable = false)
    private Servico servico;

}
