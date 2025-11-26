import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {

    @Test
    void testPrestarLibro() {
        Libro libro = new Libro("1984", "Orwell");
        libro.prestar();
        assertFalse(libro.estaDisponible());
    }

    @Test
    void testPrestarLibroNoDisponible() {
        Libro libro = new Libro("1984", "Orwell");
        libro.prestar();
        assertThrows(IllegalStateException.class, libro::prestar);
    }

    @Test
    void prestarLibro() {
        Libro libro = new Libro("1984", "Orwell");
        assertTrue(libro.estaDisponible());
        libro.prestar();
        assertFalse(libro.estaDisponible());
    }

    @Test
    void testDevolverTrasPrestar() {
        Libro libro = new Libro("1984", "Orwell");
        libro.prestar();
        libro.devolver();
        assertTrue(libro.estaDisponible());
    }

    @Test
    void testDevolverCuandoYaDisponible() {
        Libro libro = new Libro("1984", "Orwell");
        assertTrue(libro.estaDisponible());
        libro.devolver();
        assertTrue(libro.estaDisponible());
    }

    @Test
    void testEstadoInicialDisponible() {
        Libro libro = new Libro("1984", "Orwell");
        assertTrue(libro.estaDisponible());
    }
}
