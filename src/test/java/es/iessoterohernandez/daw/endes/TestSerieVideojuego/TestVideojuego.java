package es.iessoterohernandez.daw.endes.TestSerieVideojuego;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestVideojuego {
  
    private Videojuego videojuego;
  
    @BeforeEach
    public void init() {
        videojuego = new Videojuego("Baldur's Gate", 60, "Rol", "Larian");
    }
  
    @Test
    public void testGetTitulo() {
        assertEquals("Baldur's Gate", videojuego.getTitulo());
    }
  
    @Test
    public void testSetTitulo() {
        videojuego.setTitulo("Starfield");
        assertEquals("Starfield", videojuego.getTitulo());
    }
  
    @Test
    public void testGetHorasEstimadas() {
        assertEquals(60, videojuego.getHorasEstimadas());
    }
  
    @Test
    public void testSetHorasEstimadas() {
        videojuego.setHorasEstimadas(80);
        assertEquals(80, videojuego.getHorasEstimadas());
    }
  
    @Test
    public void testGetGenero() {
        assertEquals("Rol", videojuego.getGenero());
    }
  
    @Test
    public void testSetGenero() {
        videojuego.setGenero("Aventura");
        assertEquals("Aventura", videojuego.getGenero());
    }
  
    @Test
    public void testGetCompañia() {
        assertEquals("Larian", videojuego.getcompañia());
    }
  
    @Test
    public void testSetCompañia() {
        videojuego.setcompañia("Sony");
        assertEquals("Sony", videojuego.getcompañia());
    }
  
    @Test
    public void testEntregar() {
        assertFalse(videojuego.isEntregado());
        videojuego.entregar();
        assertTrue(videojuego.isEntregado());
    }
  
    @Test
    public void testDevolver() {
        videojuego.entregar();
        assertTrue(videojuego.isEntregado());
        videojuego.devolver();
        assertFalse(videojuego.isEntregado());
    }
  
    @Test
    public void testCompareTo() {
        Videojuego otroVideojuego = new Videojuego("Final Fantasy", 80, "Rol", "Square-Enix");
        assertTrue(videojuego.compareTo(otroVideojuego) < 0);
    }
  
    @Test
    public void testEquals() {
        Videojuego otroVideojuego = new Videojuego("Spider-Man", 40, "Aventura", "Sony");
        assertTrue(videojuego.equals(otroVideojuego));
    }
  
    
}
