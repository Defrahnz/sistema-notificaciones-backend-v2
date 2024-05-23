package com.sistema.notificaciones.backend.Service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.sistema.notificaciones.backend.JWT.JwtService;
import com.sistema.notificaciones.backend.Protegidos.Model.Rol;
import com.sistema.notificaciones.backend.Protegidos.Model.Usuario;
import com.sistema.notificaciones.backend.Protegidos.Repository.UsuarioRepository;
import com.sistema.notificaciones.backend.Protegidos.Request.RegistroRequest;
import com.sistema.notificaciones.backend.Request.LoginRequest;
import com.sistema.notificaciones.backend.Response.AuthResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UsuarioRepository usuarioRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authManager;

    public AuthResponse login(LoginRequest request) {
        authManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails usuario=usuarioRepository.findByUsername(request.getUsername()).orElseThrow();
        String token=jwtService.getToken(usuario);
        return AuthResponse.builder()
          .token(token)
          .build();
    }

    public AuthResponse register(RegistroRequest request) {
        Usuario usuario=Usuario.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .nombre(request.getNombre())
                .apellidoP(request.getApellidoP())
                .apellidoM(request.getApellidoM())
                .calle(request.getCalle())
                .numInt(request.getNumInt())
                .numExt(request.getNumExt())
                .colonia(request.getColonia())
                .ciudad(request.getCiudad())
                .codigoPostal(request.getCodigoPostal())
                .telefonoCasa(request.getTelefonoCasa())
                .telefonoMovil(request.getTelefonoMovil())
                .rol(Rol.USER)
                .build();
        usuarioRepository.save(usuario);
        return AuthResponse.builder()
            .token(jwtService.getToken(usuario))
            .build();
    }

}
