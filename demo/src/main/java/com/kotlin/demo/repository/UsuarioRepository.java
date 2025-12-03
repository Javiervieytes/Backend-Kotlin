package com.kotlin.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kotlin.demo.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
