package com.sistema.notificaciones.backend.Protegidos.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v2")
@RequiredArgsConstructor
public class Principal {

    @PostMapping(value="principal")
    public String bienvenida() {
        return "Bienvenida al api";
    }

}
