package ar.edu.unlp.info.oo2.filesystem;

import static org.junit.jupiter.api.Assertions.*;

import main.java.ar.edu.unlp.info.oo2.filesystem.Archivo;
import main.java.ar.edu.unlp.info.oo2.filesystem.Directorio;
import main.java.ar.edu.unlp.info.oo2.filesystem.Elemento;
import main.java.ar.edu.unlp.info.oo2.filesystem.FileSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class FileSystemTest {

    private FileSystem fs;
    private Archivo a1, a2, a3;
    private Directorio d1, d2, d3;

    @BeforeEach
    public void setUp() {
        fs = new FileSystem();

        a1 = new Archivo("doc.txt", LocalDate.of(2020, 5, 20), 100);
        a2 = new Archivo("image.jpg", LocalDate.of(2021, 6, 15), 250);
        a3 = new Archivo("image.jpg", LocalDate.of(2023, 6, 15), 180);

        d1 = new Directorio("fotos", LocalDate.of(2021, 6, 10));
        d2 = new Directorio("proyectos", LocalDate.of(2022, 7, 10));
        d3 = new Directorio("archivos", LocalDate.of(2023, 1, 1));

        d1.agregarElemento(a2);
        d2.agregarElemento(a3);
        d3.agregarElemento(a1);

        d2.agregarElemento(d3); // proyectos -> archivos -> doc.txt
        fs.agregarElemento(d1); // base -> fotos -> image.jpg
        fs.agregarElemento(d2); // base -> proyectos -> archivos -> doc.txt
    }

    @Test
    public void testTamanoTotalOcupado() {
        int expected =
                32 + a2.getTamanio() +   // fotos
                        32 + a3.getTamanio() +   // proyectos
                        32 + a1.getTamanio();    // archivos
        assertEquals(expected + 32, fs.tamanoTotalOcupado()); // + base
    }

    @Test
    public void testArchivoMasGrande() {
        assertEquals(a2, fs.archivoMasGrande());
    }

    @Test
    public void testArchivoMasNuevo() {
        assertEquals(a3, fs.archivoMasNuevo());
    }

    @Test
    public void testBuscar() {
        assertEquals(d1, fs.buscar("fotos"));
        assertEquals(a1, fs.buscar("doc.txt"));
        assertNull(fs.buscar("inexistente.txt"));
    }

    @Test
    public void testBuscarTodos() {
        List<Elemento> encontrados = fs.buscarTodos("image.jpg");
        assertEquals(2, encontrados.size());
        assertTrue(encontrados.contains(a2));
        assertTrue(encontrados.contains(a3));
    }

    @Test
    public void testListadoDeContenido() {
        String resultado = fs.listadoDeContenido();
        assertTrue(resultado.contains("/DirectorioBase/fotos/image.jpg"));
        assertTrue(resultado.contains("/DirectorioBase/proyectos/archivos/doc.txt"));
    }
}
