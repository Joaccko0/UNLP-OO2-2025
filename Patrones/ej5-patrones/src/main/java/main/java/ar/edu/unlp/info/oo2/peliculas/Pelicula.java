package main.java.ar.edu.unlp.info.oo2.peliculas;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

    private List<Pelicula> similares;
    private String titulo;
    private int estreno;
    private double puntaje;

    public Pelicula(String titulo, int anio, double puntaje) {
        this.titulo = titulo;
        this.estreno = anio;
        this.puntaje = puntaje;
        this.similares = new ArrayList<Pelicula>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEstreno() {
        return estreno;
    }

    public void setEstreno(int estreno) {
        this.estreno = estreno;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public List<Pelicula> getSimilares() {
        return new ArrayList<>(this.similares);
    }

    public void addSimilar(Pelicula pelicula) {
        this.similares.add(pelicula);
    }

    /*
        -1 si this.puntaje < puntaje
        0 si son iguales
        1 si this.puntaje > puntaje
    */
    public int compararPuntaje(double puntaje) {
        return Double.compare(this.puntaje, puntaje);
    }

    public int compararAnio(int anio) {
        return Integer.compare(anio, this.getEstreno());
    }

}
