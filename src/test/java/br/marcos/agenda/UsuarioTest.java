package br.marcos.agenda;

import br.marcos.agenda.model.Usuario;
import br.marcos.agenda.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
public class UsuarioTest {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Test
    void save() {
        Usuario usuario = new Usuario();
        usuario.setNome("Marcos");
        usuario.setEmail("marcos@gmail.com");
        usuario.setSenha("mv123");

        usuarioRepository.save(usuario);
    }

    @Test
    void buscarPorId() {
        UUID id = UUID.fromString("b1f7c2b4-11bf-4f6f-85b2-884246fa2627");
        usuarioRepository.findById(id);

    }


    @Test
    void updateUsuario(){
        UUID id = UUID.fromString("7ffeb373-5c73-40df-89cc-e5c8ae1a5ae3");
        var usuarioParaAtualizar = usuarioRepository.findById(id).orElse(null);

        usuarioParaAtualizar.setNome("Marcos Vinicius");
        usuarioParaAtualizar.setEmail("marcos@gmail.com");

        usuarioRepository.save(usuarioParaAtualizar);
    }

    @Test
    void deletarPorId() {
        UUID id = UUID.fromString("b1f7c2b4-11bf-4f6f-85b2-884246fa2627");
        usuarioRepository.deleteById(id);

    }
}
