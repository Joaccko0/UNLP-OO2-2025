package ar.info.juego.Topografias;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TopologiaTest {

    private TopologiaTierra tierra;
    private TopologiaAgua agua;
    private TopologiaMixta mixtaEjemplo;

    @BeforeEach
    public void setUp() {
        tierra = new TopologiaTierra();
        agua = new TopologiaAgua();

        // Composición del ejemplo: [Agua, Tierra, Tierra, Agua]
        mixtaEjemplo = new TopologiaMixta();
        mixtaEjemplo.agregarTopologia(agua);
        mixtaEjemplo.agregarTopologia(tierra);
        mixtaEjemplo.agregarTopologia(tierra);
        mixtaEjemplo.agregarTopologia(agua);
    }

    @Test
    public void testProporcionAguaYTierraTopologiaSimple() {
        assertEquals(1.0, agua.getProporcionAgua());
        assertEquals(0.0, agua.getProporcionTierra());

        assertEquals(0.0, tierra.getProporcionAgua());
        assertEquals(1.0, tierra.getProporcionTierra());
    }

    @Test
    public void testProporcionAguaYTierraTopologiaMixta() {
        // Agua + Tierra + Tierra + Agua = 2 de agua, 2 de tierra → /4
        assertEquals(0.5, mixtaEjemplo.getProporcionAgua(), 0.0001);
        assertEquals(0.5, mixtaEjemplo.getProporcionTierra(), 0.0001);
    }

    @Test
    public void testComparacionTierraConAgua() {
        assertFalse(tierra.comparar(agua));
        assertFalse(agua.comparar(tierra));
    }

    @Test
    public void testComparacionTierraConTierra() {
        Topologia otraTierra = new TopologiaTierra();
        assertTrue(tierra.comparar(otraTierra));
    }

    @Test
    public void testComparacionAguaConAgua() {
        Topologia otraAgua = new TopologiaAgua();
        assertTrue(agua.comparar(otraAgua));
    }

    @Test
    public void testComparacionTierraConMixta() {
        assertFalse(tierra.comparar(mixtaEjemplo));
        assertFalse(mixtaEjemplo.comparar(tierra));
    }

    @Test
    public void testComparacionMixtaConMixtaIgual() {
        TopologiaMixta otraMixta = new TopologiaMixta();
        otraMixta.agregarTopologia(agua);
        otraMixta.agregarTopologia(tierra);
        otraMixta.agregarTopologia(tierra);
        otraMixta.agregarTopologia(agua);

        assertTrue(mixtaEjemplo.comparar(otraMixta));
    }

    @Test
    public void testComparacionMixtaConMixtaDistinta() {
        TopologiaMixta distintaMixta = new TopologiaMixta();
        distintaMixta.agregarTopologia(tierra);
        distintaMixta.agregarTopologia(tierra);
        distintaMixta.agregarTopologia(tierra);
        distintaMixta.agregarTopologia(agua);

        assertFalse(mixtaEjemplo.comparar(distintaMixta));
    }

}
