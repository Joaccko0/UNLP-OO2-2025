package oo2.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class UsuarioTest {
	
	Usuario usuario, usuario2;
	Tweet tw1, tw2, tw3, rt1, rt2;
	
	@BeforeEach
	void setUp() throws Exception {
		usuario = new Usuario("Joaco");
		usuario2 = new Usuario("Pato");
		tw1 = usuario.twittear("eu bata");
		tw2 = usuario.twittear("bata eu");
		tw3 = usuario.twittear("bataaaaa");
		rt1 = usuario2.retwittear(tw3);
		rt2 = usuario.retwittear(rt1);
	}
	
    @Test
    public void testEliminarUsuario() {
        assertEquals("eu bata", usuario.leerTweet(tw1));
        assertEquals("bata eu", usuario.leerTweet(tw2));
        assertEquals("bataaaaa", usuario2.leerTweet(rt1));
        assertEquals("bataaaaa", usuario.leerTweet(rt2));
    }
    
}
