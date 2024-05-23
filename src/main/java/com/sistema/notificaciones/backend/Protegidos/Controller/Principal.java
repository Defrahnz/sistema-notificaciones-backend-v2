package com.sistema.notificaciones.backend.Protegidos.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.notificaciones.backend.Protegidos.Request.RegistroRequest;
import com.sistema.notificaciones.backend.Response.AuthResponse;
import com.sistema.notificaciones.backend.Service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v2")
@RequiredArgsConstructor
public class Principal {
    private final AuthService authService;

    @PostMapping(value="principal")
    public String bienvenida() {
        return "Bienvenida al api";
    }
    
    @PostMapping(value="register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegistroRequest request) {        
        return ResponseEntity.ok(authService.register(request));
    }

}
