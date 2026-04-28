package br.marcos.agenda.model;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

/**
 * Classe que representa a CHAVE COMPOSTA da tabela funcionario_servico.
 *
 * Essa classe NÃO é uma tabela, ela só representa o ID.
 *
 * Equivalente no banco:
 * PRIMARY KEY (funcionario_id, servico_id)
 */
@Embeddable // Indica que essa classe pode ser embutida em uma entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class FuncionarioServicoId implements Serializable {

    private UUID funcionarioId;

    private UUID servicoId;
}

