package main.java.ar.edu.unlp.info.oo2.peliculas;

import java.util.List;
import java.util.stream.Collectors;

public class Similaridad implements CriterioSugerencia{

    @Override
    public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
        List<Pelicula> reproducidas = decodificador.getPeliculasReproducidas();
        List<Pelicula> noReproducidas = decodificador.getPeliculasNoReproducidas();

        // obtener todas las películas similares a las reproducidas
        List<Pelicula> similares = reproducidas.stream()
                .flatMap(p -> p.getSimilares().stream())
                .collect(Collectors.toList());

        // Filtrar solo las similares que no se reprodujeron, ordenar por año descendente y limitar a 3
        return similares.stream()
                .filter(noReproducidas::contains)
                .sorted((p1, p2) -> p1.compararAnio(p2.getEstreno()))// más reciente primero
                .limit(3)
                .collect(Collectors.toList());
    }
}
