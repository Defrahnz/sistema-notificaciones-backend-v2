package com.sistema.notificaciones.backend.Modulo;

import java.util.List;

import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ModuloServiceImp implements ModuloService{
    
    private final ModuloRepository moduloRepository;
    
    @Override
    public List<Modulo> obtenerModulosActivos() {
        return moduloRepository.findByActivoTrue();
    }

}
