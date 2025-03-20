package oo2.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class TweetTest {
	
	Usuario autor, autor2;
	Tweet tw1, tw2, tw3, rt1, rt2, rt3, rt4;
	
	@BeforeEach
	void setUp() throws Exception {
		autor = new Usuario("Joaco");
		autor2 = new Usuario("Mateo");
		tw1 = new TweetOriginal("Hola", autor);
		tw2 = new TweetOriginal("Hol2", autor2);
		tw3 = new TweetOriginal("aaaaa", autor);
		rt1 = new Retweet(tw1);
		rt2 = new Retweet(rt1);
		rt3 = new Retweet(tw2);
		rt4 = new Retweet(rt2);
	}
	
    @Test
    public void testTwittear() {
        assertEquals("Hola", tw1.leerTweet());
        assertEquals("Hol2", tw2.leerTweet());
        assertEquals("Hola", rt1.leerTweet());
        assertEquals("Hola", rt2.leerTweet());
        assertEquals("Hol2", rt3.leerTweet());
        assertEquals("Hola", rt4.leerTweet());
        
        assertEquals("Joaco", rt1.getUsuario().getNombre());
        assertEquals("Joaco", rt2.getUsuario().getNombre());
        assertEquals("Mateo", rt3.getUsuario().getNombre());
        assertEquals("Joaco", rt4.getUsuario().getNombre());
    }
    
}
