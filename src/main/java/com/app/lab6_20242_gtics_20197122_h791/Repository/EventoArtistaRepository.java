package com.app.lab6_20242_gtics_20197122_h791.Repository;

import com.app.lab6_20242_gtics_20197122_h791.Entity.EventoArtista;
import com.app.lab6_20242_gtics_20197122_h791.Entity.EventoArtistaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoArtistaRepository extends JpaRepository<EventoArtista, EventoArtistaId> {
    //<editor-fold desc="CRUD EventoArtista">
    //</editor-fold>
}
