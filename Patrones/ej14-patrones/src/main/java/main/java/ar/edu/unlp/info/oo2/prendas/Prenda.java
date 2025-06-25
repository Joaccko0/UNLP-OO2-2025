package main.java.ar.edu.unlp.info.oo2.prendas;

public abstract class Prenda {

    public double calcularValor() {
        return this.getLiquidez() * this.getValor();
    }

    protected abstract double getValor();
    protected abstract double getLiquidez();
}
