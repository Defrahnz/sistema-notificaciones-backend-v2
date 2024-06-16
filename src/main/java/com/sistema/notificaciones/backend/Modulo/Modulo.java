package com.sistema.notificaciones.backend.Modulo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="modulos")
public class Modulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_modulo")
    private Integer idModulo;
    @Column(name="id_modulo_padre")
    private Integer idModuloPadre;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_modulo_padre", insertable = false, updatable = false)
    private Modulo moduloPadre;
    @OneToMany(mappedBy="moduloPadre",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Modulo> modulosHijos=new ArrayList<>();
    @Column(unique = true, name="nombre")
    private String nombreModulo;
    private String url;
    private String descripcion;
    @Column(name="url_imagen")
    private String urlImagen;
    private Boolean activo=true;

}
