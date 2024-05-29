package com.sistema.notificaciones.backend.Protegidos.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sistema.notificaciones.backend.Protegidos.Model.Modulo;
import com.sistema.notificaciones.backend.Protegidos.Repository.ModuloRepository;

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
