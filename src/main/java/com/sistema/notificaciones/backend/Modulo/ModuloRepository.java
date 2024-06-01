package com.sistema.notificaciones.backend.Modulo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
public interface ModuloRepository extends JpaRepository<Modulo,Integer> {
    List<Modulo> findByActivoTrue();

}
