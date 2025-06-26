package ar.edu.unlp.info.oo2.file;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import main.java.ar.edu.unlp.info.oo2.file.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileOO2Test {

    private FileOO2 archivo;

    @BeforeEach
    public void setUp() {
        this.archivo = new FileOO2("documento", ".txt", 1,
                LocalDate.of(2023, 1, 1),
                LocalDate.of(2024, 6, 1),
                "rwxr--r--");
    }

    @Test
    public void testNombreExtension() {
        FileDecorator vista = new ExtensionDecorator(
                new NombreDecorator(archivo));

        assertEquals("documento - .txt", vista.prettyPrint());
    }

    @Test
    public void testNombreFechaCreacionExtension() {
        FileDecorator vista = new ExtensionDecorator(
                new CreacionDecorator(
                        new NombreDecorator(archivo)));

        assertEquals("documento - 2023-01-01 - .txt", vista.prettyPrint());
    }

    @Test
    public void testNombreTamañoPermisosExtension() {
        FileDecorator vista = new ExtensionDecorator(
                new PermisosDecorator(
                        new SizeDecorator(
                                new NombreDecorator(archivo))));

        assertEquals("documento - 1 MB - rwxr--r-- - .txt", vista.prettyPrint());
    }
}
