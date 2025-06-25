package main.java.ar.edu.unlp.info.oo2.prendas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler extends Prenda{
    private LocalDate inicio;
    private LocalDate fin;
    private double costo;

    public Alquiler(LocalDate inicio, LocalDate fin, double costo) {
        this.inicio = inicio;
        this.fin = fin;
        this.costo = costo;
    }

    private int mesesRestantes() {
        return (int)ChronoUnit.MONTHS.between(this.inicio, this.fin);
    }

    @Override
    protected double getValor() {
        return this.mesesRestantes() * this.costo;
    }

    @Override
    protected double getLiquidez() {
        return 0.9;
    }
}
