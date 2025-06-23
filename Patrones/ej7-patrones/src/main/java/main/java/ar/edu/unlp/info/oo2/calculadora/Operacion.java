package main.java.ar.edu.unlp.info.oo2.calculadora;

public abstract class Operacion extends EstadoCalculadora {
    public Operacion(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public void mas() { this.calculadora.setEstado(new Error(calculadora)); }

    @Override
    public void menos() { this.calculadora.setEstado(new Error(calculadora)); }

    @Override
    public void por() { this.calculadora.setEstado(new Error(calculadora)); }

    @Override
    public void dividido() { this.calculadora.setEstado(new Error(calculadora)); }

    @Override
    public abstract void operar(double unValor);

    @Override
    public String getResultado() {
        this.calculadora.setEstado(new Error(calculadora));
        return "Error";
    }
}
