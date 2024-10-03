package com.app.lab6_20242_gtics_20197122_h791.Repository;

import com.app.lab6_20242_gtics_20197122_h791.Entity.Artista;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Integer> {
    //<editor-fold desc="CRUD Artista">
    //Buscar por ID query method
    @Query("SELECT a FROM Artista a WHERE a.id = :id")
    Artista buscarArtistaID(Integer id);
    //Eliminar por ID query method
    @Modifying
    @Transactional
    @Query("DELETE FROM Artista a WHERE a.id = :id")
    void eliminarArtistaID(Integer id);
    //</editor-fold>
}
