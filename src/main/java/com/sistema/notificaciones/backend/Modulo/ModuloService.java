package com.sistema.notificaciones.backend.Modulo;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ModuloService{
    
    private final ModuloRepository moduloRepository;
    
    public List<ModuloDTO> obtenerModulosActivos() {
        List<Modulo> modulos = moduloRepository.findByActivoTrue();
        return modulos.stream()
                .map(modulo -> ModuloDTO.builder()
                        .idModulo(modulo.getIdModulo())
                        .nombreModulo(modulo.getNombreModulo())
                        .urlImagen(modulo.getUrlImagen())
                        .route(modulo.getUrl())  // Ajusta la ruta según tus necesidades
                        .build())
                .collect(Collectors.toList());
    }

}
