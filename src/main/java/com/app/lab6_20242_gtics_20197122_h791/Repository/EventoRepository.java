package com.app.lab6_20242_gtics_20197122_h791.Repository;

import com.app.lab6_20242_gtics_20197122_h791.Entity.Evento;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {
    //<editor-fold desc="CRUD Evento">
    //Buscar por ID query method
    @Query("SELECT e FROM Evento e WHERE e.id = :id")
    Evento buscarEventoID(Integer id);
    //Eliminar por ID query method
    @Modifying
    @Transactional
    @Query("DELETE FROM Evento e WHERE e.id = :id")
    void eliminarEventoID(Integer id);
    //</editor-fold>
}
