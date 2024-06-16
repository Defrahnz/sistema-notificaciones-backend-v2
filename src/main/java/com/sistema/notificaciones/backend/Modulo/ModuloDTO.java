package com.sistema.notificaciones.backend.Modulo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModuloDTO {
    private Integer idModulo;
    private String nombreModulo;
    private String urlImagen;
    private String route;

}
