package main.java.ar.edu.unlp.info.oo2.peliculas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje implements CriterioSugerencia{

    @Override
    public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
        List<Pelicula> noReproducidas = decodificador.getPeliculasNoReproducidas();
        List<Pelicula> grilla = decodificador.getGrillaPeliculas();

        return grilla.stream()
                .filter(p -> noReproducidas.contains(p))
                .sorted((p1, p2) -> {
                    int comparacionPuntaje = p1.compararPuntaje(p2.getPuntaje());
                    if(comparacionPuntaje != 0) {
                        return comparacionPuntaje;
                    } else {
                        return Integer.compare(p2.getEstreno(), p1.getEstreno());
                    }
                })
                .limit(3)
                .collect(Collectors.toList());
    }
}
