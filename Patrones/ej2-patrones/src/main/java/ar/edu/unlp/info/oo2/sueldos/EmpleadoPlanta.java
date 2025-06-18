package ar.edu.unlp.info.oo2.sueldos;

public class EmpleadoPlanta extends Empleado{

    private boolean casado;
    private int hijos;
    private int antiguedad;

    public EmpleadoPlanta(double sueldoBasico, boolean casado, int hijos, int antiguedad) {
        super(sueldoBasico);
        this.antiguedad = antiguedad;
        this.hijos = hijos;
        this.casado = casado;
    }

    @Override
    public double getBasico() {
        return this.sueldoBasico;
    }

    @Override
    public double getAdicional() {
        double aux = 0;
        if(this.casado) aux += this.adicionalCasado;
        aux += (this.hijos * this.adicionalHijos);
        aux += (this.antiguedad * this.adicionalAntiguedad);
        return aux;
    }
}
