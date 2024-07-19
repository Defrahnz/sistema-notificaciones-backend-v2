package com.sistema.notificaciones.backend.Usuario;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    Optional<Usuario> findByUsername(String username);
    
    @Modifying
    @Query("update Usuario u set u.nombre=:nombre, u.apellidop=:apellidop, u.apellidom=:apellidom, " +
           "u.calle=:calle, u.numinterior=:numinterior, u.numexterior=:numexterior, u.codigopostal=:codigopostal, " +
           "u.colonia=:colonia, u.ciudad=:ciudad, u.telefonocasa=:telefonocasa, u.telefonomovil=:telefonomovil " +
           "where u.id = :id")
    void updateUsuario(@Param("id") Integer id, 
                       @Param("nombre") String nombre, 
                       @Param("apellidop") String apellidop, 
                       @Param("apellidom") String apellidom, 
                       @Param("calle") String calle, 
                       @Param("numinterior") String numinterior, 
                       @Param("numexterior") String numexterior, 
                       @Param("codigopostal") String codigopostal, 
                       @Param("colonia") String colonia, 
                       @Param("ciudad") String ciudad, 
                       @Param("telefonocasa") String telefonocasa, 
                       @Param("telefonomovil") String telefonomovil);

}
