package com.sistema.notificaciones.backend.Controller;

import com.sistema.notificaciones.backend.Protegidos.Request.RegistroRequest;
import com.sistema.notificaciones.backend.Request.LoginRequest;
import com.sistema.notificaciones.backend.Response.AuthResponse;
import com.sistema.notificaciones.backend.Service.AuthService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping(value="login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request){
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping(value="start-register")
    public ResponseEntity<AuthResponse> startRegister(@RequestBody RegistroRequest request) {        
        return ResponseEntity.ok(authService.register(request));
    }

}
