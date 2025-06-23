package main.java.ar.edu.unlp.info.oo2.calculadora;

public class Error extends EstadoCalculadora{
    public Error(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public void mas() {}

    @Override
    public void menos() {}

    @Override
    public void por() {}

    @Override
    public void dividido() {}

    @Override
    public void operar(double unValor) {}

    @Override
    public String getResultado() {
        return "Error";
    }
}
