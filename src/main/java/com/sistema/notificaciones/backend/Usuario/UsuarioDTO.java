package com.sistema.notificaciones.backend.Usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    Integer id;
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
}
