package main.java.ar.edu.unlp.info.oo2.peliculas;

import java.util.List;

public interface CriterioSugerencia {

    public List<Pelicula> sugerirPeliculas(Decodificador decodificador);

}