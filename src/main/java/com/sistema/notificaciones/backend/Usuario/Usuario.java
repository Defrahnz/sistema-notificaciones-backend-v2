package com.sistema.notificaciones.backend.Usuario;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="usuarios", uniqueConstraints={@UniqueConstraint(columnNames = {"username"})})
public class Usuario implements UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(nullable = false)
    String nombre;
    @Column(name="apellidop",nullable = false)
    String apellidoP;
    @Column(name="apellidom")
    String apellidoM;
    @Column(nullable = false)
    String calle;
    @Column(name="numerointerior")
    String numInt;
    @Column(name="numeroexterior",nullable = false)
    String numExt;
    @Column(name="codigopostal",nullable = false)
    String codigoPostal;
    @Column(nullable = false)
    String colonia;
    @Column(nullable = false)
    String ciudad;
    @Column(name="telefonocasa",nullable = false)
    String telefonoCasa;
    @Column(name="telefonomovil",nullable = false)
    String telefonoMovil;
    @Column(nullable = false)
    String username;
    String password;
    Rol rol;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority((rol.name())));
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }

}
