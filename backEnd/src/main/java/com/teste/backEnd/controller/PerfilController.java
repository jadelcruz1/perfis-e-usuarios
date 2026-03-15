package com.teste.backEnd.controller;

import com.teste.backEnd.model.Perfil;
import com.teste.backEnd.service.PerfilService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perfis")
@CrossOrigin(origins = "*")
public class PerfilController {

    private final PerfilService service;

    public PerfilController(PerfilService service) {
        this.service = service;
    }

    @GetMapping
    public List<Perfil> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Perfil> criar(@Valid @RequestBody Perfil perfil) {
        return ResponseEntity.ok(service.salvar(perfil));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Perfil> atualizar(@PathVariable Long id, @Valid @RequestBody Perfil perfil) {
        perfil.setId(id);
        return ResponseEntity.ok(service.salvar(perfil));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.ok().build();
    }
}