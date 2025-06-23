package main.java.ar.edu.unlp.info.oo2.calculadora;

public class Calculadora {

    private double valorAcumulado;
    private EstadoCalculadora estado;

    public Calculadora() {
        this.valorAcumulado = 0;
        this.setEstado(new Inicial(this));
    }

    public void setEstado(EstadoCalculadora estado) {
        this.estado = estado;
    }

    public double getValorAcumulado() {
        return valorAcumulado;
    }

    public void setValorAcumulado(double unValor) {
        this.valorAcumulado = unValor;
    }

    public String getResultado() {
        return this.estado.getResultado();
    }

    public void setValor(double unValor) {
        this.estado.operar(unValor);
    }

    public void mas() {
        this.estado.mas();
    }

    public void menos() {
        this.estado.menos();
    }

    public void por() {
        this.estado.por();
    }

    public void dividido() {
        this.estado.dividido();
    }

    public void borrar() {
        this.valorAcumulado = 0;
    }
}
