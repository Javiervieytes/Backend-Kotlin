package com.kotlin.demo.controller;

import com.kotlin.demo.model.Usuario;
import com.kotlin.demo.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@Tag(name = "Resenas Management User")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    @Operation(summary = "View a list of available Users")
    public List<Usuario> getAllUsers() {
        return usuarioService.getAllUsers();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a User by Id")
    public Usuario getUserById(@PathVariable Long id) {
        return usuarioService.getUserById(id);
    }

    @PostMapping
    @Operation(summary = "Add a new User")
    public Usuario createUser(@RequestBody Usuario usuario) {
        return usuarioService.saveUser(usuario);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing User")
    public Usuario updateUser(@PathVariable Long id, @RequestBody Usuario usuario) {
        Usuario existingUser = usuarioService.getUserById(id);
        if (existingUser != null) {
            existingUser.setName(usuario.getName());
            existingUser.setCorreo(usuario.getCorreo());
            existingUser.setContrasena(usuario.getContrasena());
            return usuarioService.saveUser(existingUser);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a User")
    public void deleteUser(@PathVariable Long id) {
        usuarioService.deleteUser(id);
    }
}
