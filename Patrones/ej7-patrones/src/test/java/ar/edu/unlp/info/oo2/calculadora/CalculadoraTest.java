package ar.edu.unlp.info.oo2.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import main.java.ar.edu.unlp.info.oo2.calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calculadora;

    @BeforeEach
    void setUp() throws Exception {
        calculadora = new Calculadora();
    }

    @Test
    void testEnunciado() {
        calculadora.setValor(5);
        assertEquals(5, calculadora.getValorAcumulado());

        calculadora.mas();
        calculadora.setValor(3);
        assertEquals(8, calculadora.getValorAcumulado());
        assertEquals("8.0", calculadora.getResultado());

        calculadora.por();
        calculadora.setValor(2);
        assertEquals(16, calculadora.getValorAcumulado());
        assertEquals("16.0", calculadora.getResultado());
    }

    @Test
    void testSuma() {
        calculadora.setValor(10);
        calculadora.mas();
        calculadora.setValor(5);
        assertEquals(15, calculadora.getValorAcumulado());
        assertEquals("15.0", calculadora.getResultado());
    }

    @Test
    void testResta() {
        calculadora.setValor(10);
        calculadora.menos();
        calculadora.setValor(4);
        assertEquals(6, calculadora.getValorAcumulado());
        assertEquals("6.0", calculadora.getResultado());
    }

    @Test
    void testMultiplicacion() {
        calculadora.setValor(3);
        calculadora.por();
        calculadora.setValor(4);
        assertEquals(12, calculadora.getValorAcumulado());
        assertEquals("12.0", calculadora.getResultado());
    }

    @Test
    void testDivision() {
        calculadora.setValor(20);
        calculadora.dividido();
        calculadora.setValor(4);
        assertEquals(5, calculadora.getValorAcumulado());
        assertEquals("5.0", calculadora.getResultado());
    }

    @Test
    void testDivisionPorCero() {
        calculadora.setValor(10);
        calculadora.dividido();
        calculadora.setValor(0); // debería causar error
        assertEquals("Error", calculadora.getResultado());

        // Además, no debería cambiar el valor acumulado
        assertEquals(10, calculadora.getValorAcumulado());
    }

    @Test
    void testCadenaDeOperaciones() {
        calculadora.setValor(10);
        calculadora.menos();
        calculadora.setValor(3); // 10 - 3 = 7
        calculadora.por();
        calculadora.setValor(2); // 7 * 2 = 14
        calculadora.dividido();
        calculadora.setValor(7); // 14 / 7 = 2
        calculadora.mas();
        calculadora.setValor(8); // 2 + 8 = 10

        assertEquals(10, calculadora.getValorAcumulado());
        assertEquals("10.0", calculadora.getResultado());
    }

    @Test
    void testBorrar() {
        calculadora.setValor(100);
        calculadora.borrar();
        assertEquals(0, calculadora.getValorAcumulado());
        assertEquals("0.0", calculadora.getResultado());
    }

    @Test
    void testOperacionInvalidaEnEstadoOperacion() {
        calculadora.setValor(5);
        calculadora.por();
        calculadora.mas(); // operación inválida en estado Multiplicando → debe pasar a Error
        assertEquals("Error", calculadora.getResultado());
    }
}
