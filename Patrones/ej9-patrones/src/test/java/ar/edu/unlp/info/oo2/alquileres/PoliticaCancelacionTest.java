package ar.edu.unlp.info.oo2.alquileres;

import main.java.ar.edu.unlp.info.oo2.alquileres.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PoliticaCancelacionTest {

    private Usuario usuario;
    private AutoEnAlquiler auto;
    private LocalDate inicio;
    private Reserva reserva;

    @BeforeEach
    void setUp() {
        usuario = new Usuario("María");
        inicio = LocalDate.of(2025, 8, 10);
        auto = new AutoEnAlquiler(2000.0, 4, "Ford", new PoliticaFlexible());
        reserva = new Reserva(usuario, 3, inicio, auto); // 3 días = 6000
    }

    @Test
    void testPoliticaFlexibleAntesDelInicio() {
        auto.setPolitica(new PoliticaFlexible());
        LocalDate cancelacion = inicio.minusDays(1);
        assertEquals(6000.0, reserva.montoAReembolsar(cancelacion));
    }

    @Test
    void testPoliticaFlexibleDespuesDelInicio() {
        auto.setPolitica(new PoliticaFlexible());
        LocalDate cancelacion = inicio.plusDays(1);
        assertEquals(0.0, reserva.montoAReembolsar(cancelacion));
    }

    @Test
    void testPoliticaEstrictaSiempreCero() {
        auto.setPolitica(new PoliticaEstricta());
        LocalDate cancelacion = inicio.minusDays(10);
        assertEquals(0.0, reserva.montoAReembolsar(cancelacion));

        cancelacion = inicio;
        assertEquals(0.0, reserva.montoAReembolsar(cancelacion));
    }

    @Test
    void testPoliticaModeradaMasDe7DiasAntes() {
        auto.setPolitica(new PoliticaModerada());
        LocalDate cancelacion = inicio.minusDays(8);
        assertEquals(6000.0, reserva.montoAReembolsar(cancelacion));
    }

    @Test
    void testPoliticaModeradaEntre2y7Dias() {
        auto.setPolitica(new PoliticaModerada());
        LocalDate cancelacion = inicio.minusDays(4);
        assertEquals(3000.0, reserva.montoAReembolsar(cancelacion));
    }

    @Test
    void testPoliticaModeradaMenosDe2Dias() {
        auto.setPolitica(new PoliticaModerada());
        LocalDate cancelacion = inicio.minusDays(1);
        assertEquals(0.0, reserva.montoAReembolsar(cancelacion));
    }
}
