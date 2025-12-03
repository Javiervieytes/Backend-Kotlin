package com.kotlin.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kotlin.demo.model.Usuario;
import com.kotlin.demo.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsers() {
        return usuarioRepository.findAll();
    }

    public Usuario getUserById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario saveUser(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deleteUser(Long id) {
        usuarioRepository.deleteById(id);
    }
}
