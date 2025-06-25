package main.java.ar.edu.unlp.info.oo2.sandwich;

public abstract class SandwichBuilder {
    protected Sandwich sandwich;

    public SandwichBuilder() {
        this.sandwich = new Sandwich();
    }

    public abstract void crearPan();
    public abstract void crearPrincipal();
    public abstract void crearAderezo();
    public abstract void crearAdicional();

    public Sandwich getSandwich() {
        return this.sandwich;
    }
}
