package com.itau.nttdata.api1.adapters.controller;

import com.itau.nttdata.api1.adapters.dto.UsuarioDto;
import com.itau.nttdata.api1.application.domain.Usuario;
import com.itau.nttdata.api1.application.ports.UsuarioServicePort;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioServicePort usuarioServicePort;

    @PostMapping("/cadastrar")
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody @Valid UsuarioDto usuarioDto){
        var usuario = new Usuario();
        BeanUtils.copyProperties(usuarioDto, usuario);
        return new ResponseEntity<>(usuarioServicePort.save(usuario), HttpStatus.CREATED);
    }

    @GetMapping("/listar-todos")
    public ResponseEntity<List<Usuario>> listarTodosOsUsuarios(){
        var listUsuarios = usuarioServicePort.listAllUsers();
        return ResponseEntity.ok(listUsuarios);
    }

    @GetMapping("/listar")
    public ResponseEntity<Usuario> listarUsuario(@RequestParam String numeroDocumento){
        var usuario = usuarioServicePort.listUserByNumeroDeDocumento(numeroDocumento);
        return ResponseEntity.ok(usuario);
    }


}
