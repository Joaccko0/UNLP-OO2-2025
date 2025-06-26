package main.java.ar.edu.unlp.info.oo2.pc;

import java.util.ArrayList;
import java.util.List;

public class PC {

    private List<Componente> componentes;

    public PC() {
        this.componentes = new ArrayList<Componente>();
    }

    public void agregarComponente(Componente componente) {
        this.componentes.add(componente);
    }

    public double calcularConsumo() {
        return this.componentes.stream().mapToDouble(c -> c.getConsumo()).sum();
    }

    public double calcularPrecio() {
        return this.componentes.stream().mapToDouble(c -> c.getPrecio()).sum();
    }
}
