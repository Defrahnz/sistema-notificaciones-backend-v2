package com.sistema.notificaciones.backend.Protegidos.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.notificaciones.backend.Protegidos.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    Optional<Usuario> findByUsername(String username);

}
