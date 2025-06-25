package main.java.ar.edu.unlp.info.oo2.sandwich;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private List<Ingrediente> ingredientes;

    public Sandwich() {
        this.ingredientes = new ArrayList<Ingrediente>();
    }

    public void agregarIngrediente(Ingrediente i) {
        this.ingredientes.add(i);
    }

    public double getPrecio() {
        return this.ingredientes.stream().mapToDouble(i -> i.getPrecio()).sum();
    }
}

