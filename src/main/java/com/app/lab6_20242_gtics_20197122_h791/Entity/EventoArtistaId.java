package com.app.lab6_20242_gtics_20197122_h791.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class EventoArtistaId implements Serializable {
    @NotNull
    @Column(name = "eventoId", nullable = false)
    private Integer eventoId;

    @NotNull
    @Column(name = "artistaId", nullable = false)
    private Integer artistaId;
}