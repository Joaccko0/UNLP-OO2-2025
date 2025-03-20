package oo2.ejercicio22;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JuegoTest {
	
	Opcion papel, tijera, piedra, spock, lagarto;
	Juego juego;
	
	@BeforeEach
	void setUp() throws Exception {
		tijera = new Tijera("Tijera");
		piedra = new Piedra("Piedra");
		papel = new Papel("Papel");
		spock = new Spock("Spock");
		lagarto = new Lagarto("Lagarto");
		tijera.agregarGanaContra(papel);
		tijera.agregarGanaContra(lagarto);
		piedra.agregarGanaContra(tijera);
		piedra.agregarGanaContra(lagarto);
		papel.agregarGanaContra(piedra);
		papel.agregarGanaContra(spock);
		lagarto.agregarGanaContra(papel);
		lagarto.agregarGanaContra(spock);
		spock.agregarGanaContra(tijera);
		spock.agregarGanaContra(piedra);
		juego = new Juego();
	}
	
    @Test
    public void testTijera() {
        assertEquals("Ganador: Tijera", juego.jugada(tijera, papel));
        assertEquals("Ganador: Piedra", juego.jugada(tijera, piedra));
        assertEquals("Ganador: Tijera", juego.jugada(tijera, lagarto));
        assertEquals("Ganador: Spock", juego.jugada(tijera, spock));
        assertEquals("Empate", juego.jugada(tijera, tijera));
    }
    
    @Test
    public void testPiedra() {
        assertEquals("Ganador: Piedra", juego.jugada(piedra, tijera));
        assertEquals("Ganador: Piedra", juego.jugada(piedra, lagarto));
        assertEquals("Ganador: Spock", juego.jugada(piedra, spock));
        assertEquals("Ganador: Papel", juego.jugada(piedra, papel));
        assertEquals("Empate", juego.jugada(piedra, piedra));
    }
    
    @Test
    public void testPapel() {
        assertEquals("Ganador: Papel", juego.jugada(papel, piedra));
        assertEquals("Ganador: Tijera", juego.jugada(papel, tijera));
        assertEquals("Ganador: Papel", juego.jugada(papel, spock));
        assertEquals("Ganador: Lagarto", juego.jugada(papel, lagarto));
        assertEquals("Empate", juego.jugada(papel, papel));
    }
    
    @Test
    public void testLagarto() {
        assertEquals("Ganador: Piedra", juego.jugada(lagarto, piedra));
        assertEquals("Ganador: Tijera", juego.jugada(lagarto, tijera));
        assertEquals("Ganador: Lagarto", juego.jugada(lagarto, papel));
        assertEquals("Ganador: Lagarto", juego.jugada(lagarto, spock));
        assertEquals("Empate", juego.jugada(lagarto, lagarto));
    }
    
    @Test
    public void testSpock() {
        assertEquals("Ganador: Spock", juego.jugada(spock, piedra));
        assertEquals("Ganador: Spock", juego.jugada(spock, tijera));
        assertEquals("Ganador: Papel", juego.jugada(spock, papel));
        assertEquals("Ganador: Lagarto", juego.jugada(spock, lagarto));
        assertEquals("Empate", juego.jugada(spock, spock));
    }
}
