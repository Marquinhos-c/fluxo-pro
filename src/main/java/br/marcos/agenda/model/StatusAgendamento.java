package br.marcos.agenda.model;

import lombok.Getter;

@Getter
public enum StatusAgendamento {

    AGENDADO("Agendado"),
    CANCELADO("Cancelado"),
    CONCLUIDO("Concluido");

    private final String descricao;

    StatusAgendamento(String descricao) {
        this.descricao = descricao;
    }
}
