package main.java.ar.edu.unlp.info.oo2.filesystem;

import java.time.LocalDate;
import java.util.List;

public class Archivo extends Elemento{

    private int size;

    public Archivo(String nombre, LocalDate creacion, int size) {
        super(nombre, creacion);
        this.size = size;
    }

    @Override
    public int getTamanio() {
        return this.size;
    }

    @Override
    public Archivo archivoMasGrande() {
        return this;
    }

    @Override
    public Archivo archivoMasNuevo() {
        return this;
    }

    @Override
    public Elemento buscar(String nombre) {
        return (this.getNombre() == nombre) ? this : null;
    }

    @Override
    public void buscarPorNombreLista(String nombre, List<Elemento> elementos) {}

    @Override
    public String listadoDeContenido(String base) {
        return base + this.getNombre() + "\n";
    }
}
