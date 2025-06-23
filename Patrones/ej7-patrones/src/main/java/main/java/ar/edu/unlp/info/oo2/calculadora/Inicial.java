package main.java.ar.edu.unlp.info.oo2.calculadora;

public class Inicial extends EstadoCalculadora {
    public Inicial(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public void mas() {
        this.calculadora.setEstado(new Sumando(calculadora));
    }

    @Override
    public void menos() {
        this.calculadora.setEstado(new Restando(calculadora));
    }

    @Override
    public void por() {
        this.calculadora.setEstado(new Multiplicando(calculadora));
    }

    @Override
    public void dividido() {
        this.calculadora.setEstado(new Dividiendo(calculadora));
    }

    @Override
    public void operar(double unValor) {
        this.calculadora.setValorAcumulado(unValor);
    }

    @Override
    public String getResultado() {
        return Double.toString(this.calculadora.getValorAcumulado());
    }
}
