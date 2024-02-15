package es.iessoterohernandez.daw.endes.TestSerieVideojuego;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSerie {
  
    private Serie serie;
  
    @BeforeEach
    public void init() {
        serie = new Serie("Loki", 2, "Drama", "Michael Waldron");
    }
  
    @Test
    public void testGetTitulo() {
        assertEquals("Loki", serie.getTitulo());
    }
  
    @Test
    public void testSetTitulo() {
        serie.setTitulo("Moon Knight");
        assertEquals("Moon Knight", serie.getTitulo());
    }
  
    @Test
    public void testGetNumeroTemporadas() {
        assertEquals(2, serie.getnumeroTemporadas());
    }
  
    @Test
    public void testSetNumeroTemporadas() {
        serie.setnumeroTemporadas(1);
        assertEquals(1, serie.getnumeroTemporadas());
    }
  
    @Test
    public void testGetGenero() {
        assertEquals("Drama", serie.getGenero());
    }
  
    @Test
    public void testSetGenero() {
        serie.setGenero("Comedia");
        assertEquals("Comedia", serie.getGenero());
    }
  
    @Test
    public void testGetCreador() {
        assertEquals("Michael Waldron", serie.getcreador());
    }
  
    @Test
    public void testSetCreador() {
        serie.setcreador("Jeremy Slater");
        assertEquals("Jeremy Slater", serie.getcreador());
    }
  
    @Test
    public void testEntregar() {
        assertFalse(serie.isEntregado());
        serie.entregar();
        assertTrue(serie.isEntregado());
    }
  
    @Test
    public void testDevolver() {
        serie.entregar();
        assertTrue(serie.isEntregado());
        serie.devolver();
        assertFalse(serie.isEntregado());
    }
  
    @Test
    public void testCompareTo() {
        Serie otraSerie = new Serie("Loki", 2, "Comedia", "Michael Waldron");
        assertTrue(serie.compareTo(otraSerie) < 0);
    }
  
    @Test
    public void testEquals() {
        Serie otraSerie = new Serie("Loki", 2, "Drama", "Michael Waldron");
        assertTrue(serie.equals(otraSerie));
    }
}