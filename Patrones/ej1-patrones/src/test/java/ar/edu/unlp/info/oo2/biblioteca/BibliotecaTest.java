package test.java.ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {

    Biblioteca biblioteca;
    Socio socio1;
    Socio socio2;

    @BeforeEach
    void setUp() throws Exception {
        biblioteca = new Biblioteca();
        socio1 = new Socio("Joaquin", "joaquinretamoso@gmail.com", "23040/5");
        socio2 = new Socio("Patricio", "patriciorivero@gmail.com", "23039/3");

        biblioteca.agregarSocio(socio1);
        biblioteca.agregarSocio(socio2);
    }

    @Test
    public void testExportarConVoorheesExporter() {
        String sep = System.lineSeparator();
        String expected = "[" + sep +
                "\t{" + sep +
                "\t\t\"nombre\": \"Joaquin\"," + sep +
                "\t\t\"email\": \"joaquinretamoso@gmail.com\"," + sep +
                "\t\t\"legajo\": \"23040/5\"" + sep +
                "\t}," + sep +
                "\t{" + sep +
                "\t\t\"nombre\": \"Patricio\"," + sep +
                "\t\t\"email\": \"patriciorivero@gmail.com\"," + sep +
                "\t\t\"legajo\": \"23039/3\"" + sep +
                "\t}" + sep +
                "]";
        assertEquals(expected, biblioteca.exportarSocios());
    }

    @Test
    public void testExportarConJsonSimpleExporter() {
        biblioteca.setExporter(new JsonSimpleExporter());

        String json = biblioteca.exportarSocios();
        System.out.println(json);

        assertTrue(json.startsWith("["));
        assertTrue(json.endsWith("]"));

        assertTrue(json.contains("\"nombre\":\"Joaquin\""));
        assertTrue(json.contains("\"email\":\"joaquinretamoso@gmail.com\""));
        assertTrue(json.contains("\"legajo\":\"23040\\/5\""));

        assertTrue(json.contains("\"nombre\":\"Patricio\""));
        assertTrue(json.contains("\"email\":\"patriciorivero@gmail.com\""));
        assertTrue(json.contains("\"legajo\":\"23039\\/3\""));
    }

    @Test
    public void testExportarConJacksonExporter() {
        biblioteca.setExporter(new JacksonExporter());

        String json = biblioteca.exportarSocios();
        System.out.println(json);

        assertTrue(json.startsWith("["));
        assertTrue(json.endsWith("]"));

        assertTrue(json.contains("\"nombre\""));
        assertTrue(json.contains("Joaquin"));
        assertTrue(json.contains("Patricio"));
    }
}
