package br.marcos.agenda.controller;

import br.marcos.agenda.controller.dto.ErroResposta;
import br.marcos.agenda.controller.dto.UsuarioDTO;
import br.marcos.agenda.exceptions.RegistroDuplicadoException;
import br.marcos.agenda.model.Usuario;
import br.marcos.agenda.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/Usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Object> salvar(@RequestBody UsuarioDTO usuarioDTO) {

        try {
            Usuario usuarioEntidade = usuarioDTO.mapearParaUsuario();
            usuarioService.salvar(usuarioEntidade);

            URI location = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(usuarioEntidade.getId())
                    .toUri();

            return ResponseEntity.created(location).build();

        } catch (RegistroDuplicadoException e) {
            var erroDTO = ErroResposta.conflito(e.getMessage());
            return ResponseEntity
                    .status(erroDTO.status())
                    .body(erroDTO);
        }
    }
}
