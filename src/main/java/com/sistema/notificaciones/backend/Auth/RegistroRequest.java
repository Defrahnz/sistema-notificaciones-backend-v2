package com.sistema.notificaciones.backend.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegistroRequest {
    String nombre;
    String apellidoP;
    String apellidoM;
    String calle;
    String numInt;
    String numExt;
    String codigoPostal;
    String colonia;
    String ciudad;
    String telefonoCasa;
    String telefonoMovil;
    String username;
    String password;
}
