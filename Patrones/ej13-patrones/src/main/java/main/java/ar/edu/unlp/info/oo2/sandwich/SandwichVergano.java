package main.java.ar.edu.unlp.info.oo2.sandwich;

public class SandwichVergano extends SandwichBuilder {
    @Override
    public void crearPan() {
        this.sandwich.agregarIngrediente(new Ingrediente("pan integral", 100));
    }

    @Override
    public void crearPrincipal() {
        this.sandwich.agregarIngrediente(new Ingrediente("milanesa de girgolas", 500));
    }

    @Override
    public void crearAderezo() {
        this.sandwich.agregarIngrediente(new Ingrediente("salsa criolla", 20));
    }

    @Override
    public void crearAdicional() {}
}
