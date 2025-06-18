package ar.edu.unlp.info.oo2.sueldos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTest {

    EmpleadoPasante pasante1, pasante2;
    EmpleadoPlanta planta1, planta2;
    EmpleadoTemporario temp1, temp2;

    @BeforeEach
    void setUp() throws Exception {
        // Pasantes
        pasante1 = new EmpleadoPasante(20000, 3); // 3 exámenes
        pasante2 = new EmpleadoPasante(20000, 0); // 0 exámenes

        // Planta
        planta1 = new EmpleadoPlanta(50000, true, 2, 5); // Casado, 2 hijos, 5 años
        planta2 = new EmpleadoPlanta(50000, false, 0, 0); // Soltero, sin hijos, sin antigüedad

        // Temporario
        temp1 = new EmpleadoTemporario(20000, 10, true, 1); // 10hs, casado, 1 hijo
        temp2 = new EmpleadoTemporario(20000, 0, false, 0); // 0hs, soltero, sin hijos
    }

    // ------------------ PASANTE ------------------

    @Test
    void testPasante1Descuento() {
        double basico = 20000;
        double adicional = 3 * 2000;
        assertEquals(basico * 0.13 + adicional * 0.05, pasante1.getDescuentos(), 0.01);
    }

    @Test
    void testPasante1Sueldo() {
        double sueldo = 20000 + 6000 - (20000 * 0.13 + 6000 * 0.05);
        assertEquals(sueldo, pasante1.getSueldo(), 0.01);
    }

    @Test
    void testPasante2SinAdicional() {
        assertEquals(20000 * 0.13, pasante2.getDescuentos(), 0.01);
        assertEquals(20000 - 20000 * 0.13, pasante2.getSueldo(), 0.01);
    }

    // ------------------ PLANTA ------------------

    @Test
    void testPlanta1Completo() {
        double adicional = 5000 + 2 * 2000 + 5 * 2000; // Casado, hijos, antigüedad
        double basico = 50000;
        double descuento = basico * 0.13 + adicional * 0.05;
        double esperado = basico + adicional - descuento;
        assertEquals(descuento, planta1.getDescuentos(), 0.01);
        assertEquals(esperado, planta1.getSueldo(), 0.01);
    }

    @Test
    void testPlanta2SinAdicional() {
        double esperado = 50000 - (50000 * 0.13);
        assertEquals(esperado, planta2.getSueldo(), 0.01);
    }

    // ------------------ TEMPORARIO ------------------

    @Test
    void testTemporario1Completo() {
        double basico = 20000 + 10 * 300;
        double adicional = 5000 + 2000; // Casado, 1 hijo
        double descuento = basico * 0.13 + adicional * 0.05;
        double esperado = basico + adicional - descuento;
        assertEquals(esperado, temp1.getSueldo(), 0.01);
    }

    @Test
    void testTemporario2SinNada() {
        double basico = 20000;
        double adicional = 0;
        double descuento = basico * 0.13;
        double esperado = basico - descuento;
        assertEquals(esperado, temp2.getSueldo(), 0.01);
    }
}
