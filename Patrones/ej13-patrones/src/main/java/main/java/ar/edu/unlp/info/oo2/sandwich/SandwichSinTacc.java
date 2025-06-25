package main.java.ar.edu.unlp.info.oo2.sandwich;

public class SandwichSinTacc extends SandwichBuilder {
    @Override
    public void crearPan() {
        this.sandwich.agregarIngrediente(new Ingrediente("pan de chipa", 150));
    }

    @Override
    public void crearPrincipal() {
        this.sandwich.agregarIngrediente(new Ingrediente("carne de pollo", 250));
    }

    @Override
    public void crearAderezo() {
        this.sandwich.agregarIngrediente(new Ingrediente("salsa tartara", 18));
    }

    @Override
    public void crearAdicional() {
        this.sandwich.agregarIngrediente(new Ingrediente("verduras grilladas", 200));
    }
}
