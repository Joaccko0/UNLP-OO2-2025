package main.java.ar.edu.unlp.info.oo2.prendas;

import java.util.ArrayList;
import java.util.List;

public class PrendaCombinada extends Prenda{

    private List<Prenda> prendas;

    public PrendaCombinada() {
        this.prendas = new ArrayList<Prenda>();
    }

    public void agregarPrenda(Prenda prenda) {
        this.prendas.add(prenda);
    }


    @Override
    protected double getValor() {
        return this.prendas.stream()
                .mapToDouble(p -> p.getValor())
                .sum();
    }

    @Override
    protected double getLiquidez() {
        return 0.5;
    }
}
