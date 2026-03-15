package com.teste.backEnd.service;

import com.teste.backEnd.model.Perfil;
import com.teste.backEnd.repository.PerfilRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilService {

    private final PerfilRepository repository;

    public PerfilService(PerfilRepository repository) {
        this.repository = repository;
    }

    public Perfil salvar(Perfil perfil) {
        return repository.save(perfil);
    }

    public List<Perfil> listarTodos() {
        return repository.findAll();
    }

    public Perfil buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Perfil não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
