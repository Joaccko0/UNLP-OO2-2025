package oo2.ejercicio22;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class JuegoTest {
	
	Juego piedra, papel, tijera, lagarto, spock;
	Resultado r;
	
	@BeforeEach
	void setUp() throws Exception {
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
		spock = new Spock();
		lagarto = new Lagarto();
	}
	
    @Test
    public void testTijera() {
    	assertEquals(Resultado.PIERDE, tijera.jugar(piedra));
    	assertEquals(Resultado.GANA, tijera.jugar(papel));
    	assertEquals(Resultado.EMPATA, tijera.jugar(tijera));
    	assertEquals(Resultado.GANA, tijera.jugar(lagarto));
    	assertEquals(Resultado.PIERDE, tijera.jugar(spock));
    }
    
    @Test
    public void testPiedra() {
    	assertEquals(Resultado.EMPATA, piedra.jugar(piedra));
    	assertEquals(Resultado.PIERDE, piedra.jugar(papel));
    	assertEquals(Resultado.GANA, piedra.jugar(tijera));
    	assertEquals(Resultado.GANA, piedra.jugar(lagarto));
    	assertEquals(Resultado.PIERDE, piedra.jugar(spock));
    }
    
    @Test
    public void testPapel() {
    	assertEquals(Resultado.GANA, papel.jugar(piedra));
    	assertEquals(Resultado.EMPATA, papel.jugar(papel));
    	assertEquals(Resultado.PIERDE, papel.jugar(tijera));
    	assertEquals(Resultado.PIERDE, papel.jugar(lagarto));
    	assertEquals(Resultado.GANA, papel.jugar(spock));
    }
    
    @Test
    public void testLagarto() {
    	assertEquals(Resultado.PIERDE, lagarto.jugar(piedra));
    	assertEquals(Resultado.GANA, lagarto.jugar(papel));
    	assertEquals(Resultado.PIERDE, lagarto.jugar(tijera));
    	assertEquals(Resultado.EMPATA, lagarto.jugar(lagarto));
    	assertEquals(Resultado.GANA, lagarto.jugar(spock));
    }
    
    @Test
    public void testSpock() {
    	assertEquals(Resultado.GANA, spock.jugar(piedra));
    	assertEquals(Resultado.PIERDE, spock.jugar(papel));
    	assertEquals(Resultado.GANA, spock.jugar(tijera));
    	assertEquals(Resultado.PIERDE, spock.jugar(lagarto));
    	assertEquals(Resultado.EMPATA, spock.jugar(spock));
    }
    
}
