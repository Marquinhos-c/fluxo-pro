package br.marcos.agenda.controller.dto;

import br.marcos.agenda.model.Usuario;

import java.time.LocalDateTime;
import java.util.UUID;

public record UsuarioDTO(
        UUID id,
        String nome,
        String email,
        String senha,
        LocalDateTime criadoEm) {

    public Usuario mapearParaUsuario() {

        Usuario usuario = new Usuario();

        usuario.setNome(this.nome);
        usuario.setEmail(this.email);
        usuario.setSenha(this.senha);

        return usuario;
    }

}
