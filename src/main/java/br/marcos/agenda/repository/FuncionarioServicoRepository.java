package br.marcos.agenda.repository;

import br.marcos.agenda.model.FuncionarioServico;
import br.marcos.agenda.model.FuncionarioServicoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioServicoRepository extends JpaRepository<FuncionarioServico, FuncionarioServicoId> {

}
