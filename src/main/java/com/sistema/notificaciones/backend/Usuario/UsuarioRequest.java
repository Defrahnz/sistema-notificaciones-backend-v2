package com.sistema.notificaciones.backend.Usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequest {
    int id;
    String nombre;
    String apellidop;
    String apellidom;
    String calle;
    String numinterior;
    String numexterior;
    String codigopostal;
    String colonia;
    String ciudad;
    String telefonocasa;
    String telefonomovil;
    String username;

}
