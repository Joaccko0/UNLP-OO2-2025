package main.java.ar.edu.unlp.info.oo2.alquileres;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private List<AutoEnAlquiler> autosEnAlquiler;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.autosEnAlquiler = new ArrayList<AutoEnAlquiler>();
    }

    public void alquilarAuto(AutoEnAlquiler auto) {
        this.autosEnAlquiler.add(auto);
    }
}
