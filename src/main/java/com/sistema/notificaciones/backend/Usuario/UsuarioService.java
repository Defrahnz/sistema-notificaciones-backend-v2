package com.sistema.notificaciones.backend.Usuario;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository; 

    @Transactional
    public UsuarioResponse updateUsuario(UsuarioRequest usuarioRequest) {
        Usuario usuario = Usuario.builder()
            .id(usuarioRequest.getId())
            .nombre(usuarioRequest.getNombre())
            .apellidop(usuarioRequest.getApellidop())
            .apellidom(usuarioRequest.getApellidom())
            .calle(usuarioRequest.getCalle())
            .numinterior(usuarioRequest.getNuminterior())
            .numexterior(usuarioRequest.getNumexterior())
            .codigopostal(usuarioRequest.getCodigopostal())
            .colonia(usuarioRequest.getColonia())
            .ciudad(usuarioRequest.getCiudad())
            .telefonocasa(usuarioRequest.getTelefonocasa())
            .telefonomovil(usuarioRequest.getTelefonomovil())
            //.rol(Rol.USER) // Ajustar según el rol necesario
            .build();
        
        usuarioRepository.updateUsuario(
            usuario.getId(), usuario.getNombre(), usuario.getApellidop(), usuario.getApellidom(),
            usuario.getCalle(), usuario.getNuminterior(), usuario.getNumexterior(), usuario.getCodigopostal(),
            usuario.getColonia(), usuario.getCiudad(), usuario.getTelefonocasa(), usuario.getTelefonomovil());

        return new UsuarioResponse("El usuario se actualizó satisfactoriamente");
    }

    public UsuarioDTO getUsuario(Integer id) {
        Usuario usuario = usuarioRepository.findById(id).orElse(null);
        if (usuario != null) {
            UsuarioDTO usuarioDTO = UsuarioDTO.builder()
                .id(usuario.getId())
                .nombre(usuario.getNombre())
                .apellidop(usuario.getApellidop())
                .apellidom(usuario.getApellidom())
                .calle(usuario.getCalle())
                .numinterior(usuario.getNuminterior())
                .numexterior(usuario.getNumexterior())
                .codigopostal(usuario.getCodigopostal())
                .colonia(usuario.getColonia())
                .ciudad(usuario.getCiudad())
                .telefonocasa(usuario.getTelefonocasa())
                .telefonomovil(usuario.getTelefonomovil())
                .username(usuario.getUsername())
                .build();
            return usuarioDTO;
        }
        return null;
    }
}
