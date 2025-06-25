package main.java.ar.edu.unlp.info.oo2.filesystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends Elemento{

    private List<Elemento> contenido;

    public Directorio(String nombre, LocalDate creacion) {
        super(nombre, creacion);
        this.contenido = new ArrayList<Elemento>();
    }

    public void agregarElemento(Elemento elemento) {
        this.contenido.add(elemento);
    }

    @Override
    public int getTamanio() {
        return 32 + this.contenido.stream()
                .mapToInt(e -> e.getTamanio())
                .sum();
    }

    @Override
    public Archivo archivoMasGrande() {
        return this.contenido.stream()
                .map(e -> e.archivoMasGrande())
                .max((a1, a2) -> Integer.compare(a1.getTamanio(), a2.getTamanio()))
                .orElse(null);
    }

    @Override
    public Archivo archivoMasNuevo() {
        return this.contenido.stream()
                .map(e -> e.archivoMasNuevo())
                .max((a1, a2) -> a1.getFecha().compareTo(a2.getFecha()))
                .orElse(null);
    }

    @Override
    public Elemento buscar(String nombre) {
        return (this.getNombre() == nombre) ? this :
                this.contenido.stream()
                        .map(e -> e.buscar(nombre))
                        .filter(e -> e != null)
                        .findFirst().orElse(null);
    }

    @Override
    public void buscarPorNombreLista(String nombre, List<Elemento> elementos) {
        this.contenido.stream().forEach(e -> e.buscarTodos(nombre, elementos));
    }

    @Override
    public String listadoDeContenido(String base) {
        StringBuilder resultado = new StringBuilder();
        String actual = base + this.getNombre();
        resultado.append(actual).append("\n");

        resultado.append(
                contenido.stream()
                        .map(e -> e.listadoDeContenido(actual + "/"))
                        .collect(Collectors.joining())
        );
        return resultado.toString();
    }
}
