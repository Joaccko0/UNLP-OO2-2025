package oo2.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class TwitterTest {
	
	Twitter twitter;
	Usuario user, user2, user3;
	Tweet tw1, tw2, tw3, rt1, rt2, rt3, rt4;
	
	@BeforeEach
	void setUp() throws Exception {
		twitter = new Twitter();
		user = twitter.crearUsuario("Joaco");
		user2 = twitter.crearUsuario("Mateo");
		user3 = twitter.crearUsuario("Pato");
		tw1 = user.twittear("Hola");
		tw2 = user.twittear("salchichita");
		rt1 = user2.retwittear(tw2);
		rt2 = user3.retwittear(rt1);
		rt3 = user2.retwittear(tw1);
		rt4 = user3.retwittear(rt2);
		tw3 = user2.twittear("god");
	}
	
    @Test
    public void testTwittear() {
        twitter.eliminarUsuario(user);
        assertEquals("", user3.leerTweets());
        assertEquals("god\n", user2.leerTweets());
    }
    
}
