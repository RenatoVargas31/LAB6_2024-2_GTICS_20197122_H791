package com.app.lab6_20242_gtics_20197122_h791.Controller;

import com.app.lab6_20242_gtics_20197122_h791.Entity.Artista;
import com.app.lab6_20242_gtics_20197122_h791.Entity.Evento;
import com.app.lab6_20242_gtics_20197122_h791.Repository.ArtistaRepository;
import com.app.lab6_20242_gtics_20197122_h791.Repository.EventoArtistaRepository;
import com.app.lab6_20242_gtics_20197122_h791.Repository.EventoRepository;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/app")
public class AppController {
    //Repository
    final ArtistaRepository artistaRepository;
    final EventoRepository eventoRepository;
    final EventoArtistaRepository eventoArtistaRepository;
    public AppController(ArtistaRepository artistaRepository, EventoRepository eventoRepository, EventoArtistaRepository eventoArtistaRepository) {
        this.artistaRepository = artistaRepository;
        this.eventoRepository = eventoRepository;
        this.eventoArtistaRepository = eventoArtistaRepository;
    }
    @GetMapping("/Inicio")
    public String getInicio() {
        return "EvenMaster";
    }
    //<editor-fold desc="Artistas">
    @GetMapping("/Artistas")
    public String getArtistas(Model model) {
        //Listar Artistas
        List<Artista> artistas = artistaRepository.findAll();
        //Enviar a la vista
        model.addAttribute("artistas", artistas);
        return "Artistas";
    }
    @GetMapping("/ArtistaFormNew")
    public String getArtistaFormNew(Model model) {
        //Enviar un nuevo artista
        model.addAttribute("artista", new Artista());
        return "ArtistaFormNew";
    }
    @PostMapping("/ArtistaFormEdit")
    public String getArtistaFormEdit(Model model, Integer id) {
        //Buscar artista por ID
        Artista artista = artistaRepository.buscarArtistaID(id);
        //Enviar a la vista
        model.addAttribute("artista", artista);
        return "ArtistaFormEdit";
    }
    @PostMapping("/ArtistaNuevo")
    public String postArtistaNuevo(@ModelAttribute Artista artista) {
        return "redirect:/app/Artistas";
    }
    @PostMapping("/ArtistaEditado")
    public String postArtistaEditado(@ModelAttribute Artista artista) {
        return "redirect:/app/Artistas";
    }
    @GetMapping("/ArtistaEliminar")
    public String getArtistaEliminar(Integer id) {
        //Eliminar artista por ID
        System.out.println("Artista eliminado con ID: " + id);
        artistaRepository.eliminarArtistaID(id);
        return "redirect:/app/Artistas";
    }
    //</editor-fold>

    //<editor-fold desc="Eventos">
    @GetMapping("/Eventos")
    public String getEventos(Model model) {
        //Listar Eventos
        List<Evento> eventos = eventoRepository.findAll();
        //Enviar a la vista
        model.addAttribute("eventos", eventos);
        return "Eventos";
    }
    @GetMapping("/EventoFormNew")
    public String getEventoFormNew(Model model) {
        //Enviar un nuevo evento
        model.addAttribute("evento", new Evento());
        return "EventoFormNew";
    }
    @GetMapping("/EventoFormEdit")
    public String getEventoFormEdit(Model model, Integer id) {
        //Buscar evento por ID
        Evento evento = eventoRepository.buscarEventoID(id);
        //Enviar a la vista
        model.addAttribute("evento", evento);
        return "EventoFormEdit";
    }
    @PostMapping("/EventoNuevo")
    public String postEventoNuevo(@ModelAttribute Evento evento) {
        //Guardar evento
        eventoRepository.save(evento);
        return "redirect:/app/Eventos";
    }
    @PostMapping("/EventoEditado")
    public String postEventoEditado(@ModelAttribute Evento evento) {
        return "redirect:/app/Eventos";
    }
    @GetMapping("/EventoEliminar")
    public String getEventoEliminar(Integer id) {
        //Eliminar evento por ID
        System.out.println("Evento eliminado con ID: " + id);
        eventoRepository.eliminarEventoID(id);
        return "redirect:/app/Eventos";
    }
    //</editor-fold>

    //<editor-fold desc="Contacto">
    @GetMapping("/Contacto")
    public String getContacto() {
        return "Contacto";
    }
    //</editor-fold>
}
