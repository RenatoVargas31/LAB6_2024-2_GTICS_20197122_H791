package com.app.lab6_20242_gtics_20197122_h791.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "eventos_artistas")
public class EventoArtista {
    @EmbeddedId
    private EventoArtistaId id;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "eventoId", nullable = false)
    private Evento evento;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "artistaId", nullable = false)
    private Artista artista;

}
