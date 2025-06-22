package ar.edu.unlp.info.oo2.peliculas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import main.java.ar.edu.unlp.info.oo2.peliculas.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DecodificadorTest {

    Decodificador decodificador;
    Pelicula thor;
    Pelicula ironMan;
    Pelicula capitanAmerica;
    Pelicula rambo;
    Pelicula rocky;
    Pelicula dunkirk;

    @BeforeEach
    void setUp() throws Exception {
        thor = new Pelicula("Thor", 2007, 7.9);
        ironMan = new Pelicula("Iron Man", 2010, 7.9);
        capitanAmerica = new Pelicula("Capitan America", 2016, 7.8);
        rambo = new Pelicula("Rambo", 1979, 7.8);
        rocky = new Pelicula("Rocky", 1976, 8.1);
        dunkirk = new Pelicula("Dunkirk", 2017, 7.9);

        thor.addSimilar(capitanAmerica); thor.addSimilar(ironMan);
        capitanAmerica.addSimilar(ironMan);
        rambo.addSimilar(rocky);

        decodificador = new Decodificador(new Novedad());
        decodificador.añadirPeliculaGrilla(thor);
        decodificador.añadirPeliculaGrilla(ironMan);
        decodificador.añadirPeliculaGrilla(capitanAmerica);
        decodificador.añadirPeliculaGrilla(rambo);
        decodificador.añadirPeliculaGrilla(rocky);
        decodificador.añadirPeliculaGrilla(dunkirk);

        decodificador.reproducirPelicula(thor);
        decodificador.reproducirPelicula(rocky);
    }

    @Test
    void testInciso3() {
        //configure al decodificador para que sugiera por similaridad (ii)
        decodificador.setCriterioSugerencia(new Similaridad());
        // solicite al mismo decodificador las sugerencias
        List<Pelicula> sugeridasSimilaridad = decodificador.sugerirPeliculas();

        //configure al mismo decodificador para que sugiera por puntaje (iii)
        decodificador.setCriterioSugerencia(new Puntaje());
        //solicite al mismo decodificador las sugerencias
        List<Pelicula> sugeridasPuntaje = decodificador.sugerirPeliculas();

        //Similaridad
        assertTrue(sugeridasSimilaridad.contains(capitanAmerica));
        assertTrue(sugeridasSimilaridad.indexOf(capitanAmerica) == 0);
        assertTrue(sugeridasSimilaridad.contains(ironMan));
        assertTrue(sugeridasSimilaridad.indexOf(ironMan) == 1);
        assertTrue(sugeridasSimilaridad.contains(rambo));
        assertTrue(sugeridasSimilaridad.indexOf(rambo) == 2);
        assertEquals(3, sugeridasSimilaridad.size());

        //Puntaje
        assertTrue(sugeridasPuntaje.contains(dunkirk));
        assertTrue(sugeridasPuntaje.indexOf(dunkirk) == 0);
        assertTrue(sugeridasPuntaje.contains(ironMan));
        assertTrue(sugeridasPuntaje.indexOf(ironMan) == 1);
        assertTrue(sugeridasPuntaje.contains(capitanAmerica));
        assertTrue(sugeridasPuntaje.indexOf(capitanAmerica) == 2);
        assertEquals(3, sugeridasPuntaje.size());
    }

    // Novedad
    @Test
    void testCriterioNovedad() {
        List<Pelicula> sugeridas = decodificador.sugerirPeliculas();
        assertTrue(sugeridas.contains(dunkirk));
        assertTrue(sugeridas.indexOf(dunkirk) == 0);
        assertTrue(sugeridas.contains(capitanAmerica));
        assertTrue(sugeridas.indexOf(capitanAmerica) == 1);
        assertTrue(sugeridas.contains(ironMan));
        assertTrue(sugeridas.indexOf(ironMan) == 2);
        assertEquals(3, sugeridas.size());
    }

    @Test
    void testCriterioSimilaridad() {
        decodificador.setCriterioSugerencia(new Similaridad());
        List<Pelicula> sugeridas = decodificador.sugerirPeliculas();
        assertTrue(sugeridas.contains(capitanAmerica));
        assertTrue(sugeridas.indexOf(capitanAmerica) == 0);
        assertTrue(sugeridas.contains(ironMan));
        assertTrue(sugeridas.indexOf(ironMan) == 1);
        assertTrue(sugeridas.contains(rambo));
        assertTrue(sugeridas.indexOf(rambo) == 2);
        assertEquals(3, sugeridas.size());
    }

    @Test
    void testCriterioPuntaje() {
        decodificador.setCriterioSugerencia(new Puntaje());
        List<Pelicula> sugeridas = decodificador.sugerirPeliculas();
        for(int i = 0; i < sugeridas.size(); i++) {
            System.out.println(sugeridas.get(i).toString());
        }
        assertTrue(sugeridas.contains(dunkirk));
        assertTrue(sugeridas.indexOf(dunkirk) == 0);
        assertTrue(sugeridas.contains(ironMan));
        assertTrue(sugeridas.indexOf(ironMan) == 1);
        assertTrue(sugeridas.contains(capitanAmerica));
        assertTrue(sugeridas.indexOf(capitanAmerica) == 2);
        assertEquals(3, sugeridas.size());
    }

}