package main.java.ar.edu.unlp.info.oo2.calculadora;

public class Multiplicando extends Operacion{
    public Multiplicando(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public void operar(double unValor) {
        this.calculadora.setValorAcumulado(this.calculadora.getValorAcumulado() * unValor);
        this.calculadora.setEstado(new Inicial(calculadora));
    }
}
