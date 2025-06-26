package main.java.ar.edu.unlp.info.oo2.pc;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Componente> componentes;

    public Catalogo() {
        this.componentes = new ArrayList<Componente>();
    }

    public void agregarComponente(Componente componente) {
        this.componentes.add(componente);
    }

    public Componente getComponente(String descripcion) {
        return this.componentes.stream().filter(c -> c.getDescripcion() == descripcion).findFirst().orElse(null);
    }

}
