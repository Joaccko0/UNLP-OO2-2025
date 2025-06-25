package main.java.ar.edu.unlp.info.oo2.filesystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Elemento {

    private String nombre;
    private LocalDate fechaCreacion;

    public Elemento(String nombre, LocalDate creacion) {
        this.nombre = nombre;
        this.fechaCreacion = creacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public LocalDate getFecha() {
        return this.fechaCreacion;
    }

    public abstract int getTamanio();
    public abstract Archivo archivoMasGrande();
    public abstract Archivo archivoMasNuevo();
    public abstract Elemento buscar(String nombre);
    public abstract void buscarPorNombreLista(String nombre, List<Elemento> elementos);

    public void buscarTodos(String nombre, List<Elemento> elementos) {
        if(this.getNombre() == nombre) {
            elementos.add(this);
        }
        this.buscarPorNombreLista(nombre, elementos);
    }

    public abstract String listadoDeContenido(String base);
}
