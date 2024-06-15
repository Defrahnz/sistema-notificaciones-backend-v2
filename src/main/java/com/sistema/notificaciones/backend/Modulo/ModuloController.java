package com.sistema.notificaciones.backend.Modulo;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value="/api/v2/modulo")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:4200")
public class ModuloController {
    private final ModuloService moduloService;

    @GetMapping(value="/activos")
    public List<Modulo> obtenerModulosActivos(){
        return moduloService.obtenerModulosActivos();
    }
    

}
