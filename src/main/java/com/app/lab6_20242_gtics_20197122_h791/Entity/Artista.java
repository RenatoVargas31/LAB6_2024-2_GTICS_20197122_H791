package com.app.lab6_20242_gtics_20197122_h791.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "artistas")
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artistaId", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Column(name = "nombre", length = 100)
    private String nombre;

    @Size(max = 50)
    @Column(name = "genero", length = 50)
    private String genero;

    @Size(max = 9)
    @Column(name = "telefono", length = 9)
    private String telefono;

}
