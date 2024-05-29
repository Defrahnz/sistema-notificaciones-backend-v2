package com.sistema.notificaciones.backend.Protegidos.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.notificaciones.backend.Protegidos.Model.Modulo;

public interface ModuloRepository extends JpaRepository<Modulo,Integer> {
    List<Modulo> findByActivoTrue();

}
