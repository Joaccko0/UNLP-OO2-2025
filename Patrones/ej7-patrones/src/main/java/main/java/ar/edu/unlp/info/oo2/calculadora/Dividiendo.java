package main.java.ar.edu.unlp.info.oo2.calculadora;

public class Dividiendo extends Operacion{
    public Dividiendo(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public void operar(double unValor) {
        if(unValor == 0) {
            this.calculadora.setEstado(new Error(calculadora));
        } else {
            this.calculadora.setValorAcumulado(this.calculadora.getValorAcumulado() / unValor);
            this.calculadora.setEstado(new Inicial(calculadora));
        }
    }
}
