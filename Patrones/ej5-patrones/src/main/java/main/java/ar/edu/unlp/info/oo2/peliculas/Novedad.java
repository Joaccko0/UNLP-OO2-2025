package main.java.ar.edu.unlp.info.oo2.peliculas;

import java.util.List;
import java.util.stream.Collectors;

public class Novedad implements CriterioSugerencia{

    @Override
    public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
        List<Pelicula> noReproducidas = decodificador.getPeliculasNoReproducidas();

        return decodificador.getGrillaPeliculas().stream()
                .filter(p -> noReproducidas.contains(p))
                .sorted((p1, p2) -> p1.compararAnio(p2.getEstreno()))
                .limit(3)
                .collect(Collectors.toList());
    }
}
