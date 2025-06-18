package ar.edu.unlp.info.oo2.sueldos;

public class EmpleadoTemporario extends Empleado{

    private int cantidadHorasTrabajadas;
    private final double valorHora = 300;
    private boolean casado;
    private int hijos;

    public EmpleadoTemporario(double sueldoBasico, int cantidadHorasTrabajadas, boolean casado, int hijos) {
        super(sueldoBasico);
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
        this.casado = casado;
        this.hijos = hijos;
    }

    @Override
    public double getBasico() {
        return this.sueldoBasico + this.cantidadHorasTrabajadas * this.valorHora;
    }

    @Override
    public double getAdicional() {
        double aux = 0;
        if(casado) aux += this.adicionalCasado;
        aux += (this.hijos * this.adicionalHijos);
        return aux;
    }
}
