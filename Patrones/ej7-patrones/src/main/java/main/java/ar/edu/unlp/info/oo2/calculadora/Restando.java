package main.java.ar.edu.unlp.info.oo2.calculadora;

public class Restando extends Operacion{
    public Restando(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public void operar(double unValor) {
        this.calculadora.setValorAcumulado(this.calculadora.getValorAcumulado() - unValor);
        this.calculadora.setEstado(new Inicial(calculadora));
    }
}
