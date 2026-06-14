package br.marcos.agenda.service;

import br.marcos.agenda.model.Usuario;
import br.marcos.agenda.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;

    public Usuario salvar(Usuario usuario) {
       return repository.save(usuario);
    }
}
