package ar.edu.unlp.info.oo2.sueldos;

public abstract class Empleado {

    protected double sueldoBasico;
    protected final double adicionalCasado = 5000;
    protected final double adicionalHijos = 2000;
    protected final double adicionalExamen = 2000;
    protected final double adicionalAntiguedad = 2000;

    public Empleado(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldo() {
        return this.getBasico() + this.getAdicional() - this.getDescuentos();
    }

    public abstract double getBasico();
    public abstract double getAdicional();

    public double getDescuentos() {
        return (this.getBasico() * 0.13 + this.getAdicional() * 0.05);
    }

}
