package br.marcos.agenda.repository;

import br.marcos.agenda.model.HorarioDisponivel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HorarioDisponivelRepository extends JpaRepository<HorarioDisponivel, UUID> {

}
