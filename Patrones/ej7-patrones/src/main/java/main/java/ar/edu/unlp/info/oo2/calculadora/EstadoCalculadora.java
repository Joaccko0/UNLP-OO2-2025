package main.java.ar.edu.unlp.info.oo2.calculadora;

public abstract class EstadoCalculadora {

    protected Calculadora calculadora;

    public EstadoCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public abstract void mas();
    public abstract void menos();
    public abstract void por();
    public abstract void dividido();
    public abstract void operar(double unValor);
    public abstract String getResultado();

}
