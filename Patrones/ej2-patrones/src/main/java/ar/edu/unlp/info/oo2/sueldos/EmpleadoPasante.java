package ar.edu.unlp.info.oo2.sueldos;

public class EmpleadoPasante extends Empleado{

    private int cantidadExamenes;

    public EmpleadoPasante(double sueldoBasico, int cantidadExamenes) {
        super(sueldoBasico);
        this.cantidadExamenes = cantidadExamenes;
    }

    @Override
    public double getBasico() {
        return this.sueldoBasico;
    }

    @Override
    public double getAdicional() {
        return (this.cantidadExamenes * this.adicionalExamen);
    }
}
