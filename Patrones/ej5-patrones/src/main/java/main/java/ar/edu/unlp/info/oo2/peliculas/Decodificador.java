package main.java.ar.edu.unlp.info.oo2.peliculas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Decodificador {

    private List<Pelicula> grillaPeliculas;
    private List<Pelicula> reproducidas;
    private CriterioSugerencia criterioSugerencia;

    public Decodificador(CriterioSugerencia criterio) {
        this.criterioSugerencia = criterio;
    }

    public void setCriterioSugerencia(CriterioSugerencia criterio) {
        this.criterioSugerencia = criterio;
    }

    public List<Pelicula> getGrillaPeliculas() {
        return new ArrayList<Pelicula>(this.grillaPeliculas);
    }

    public List<Pelicula> getPeliculasReproducidas() {
        return new ArrayList<Pelicula>(this.reproducidas);
    }

    public List<Pelicula> getPeliculasNoReproducidas() {
        return new ArrayList<Pelicula>(
                this.grillaPeliculas.stream()
                        .filter(p -> !this.reproducidas.contains(p))
                        .collect(Collectors.toList())
        );
    }

    public void reproducirPelicula(Pelicula pelicula) {
        if(!this.reproducidas.contains(pelicula)) {
            this.reproducidas.add(pelicula);
        }
    }
}
