package main.java.ar.edu.unlp.info.oo2.sandwich;

public class SandwichVegetariano extends SandwichBuilder {

    @Override
    public void crearPan() {
        this.sandwich.agregarIngrediente(new Ingrediente("pan con semillas", 120));
    }

    @Override
    public void crearPrincipal() {
        this.sandwich.agregarIngrediente(new Ingrediente("provoleta", 200));
    }

    @Override
    public void crearAderezo() {}

    @Override
    public void crearAdicional() {
        this.sandwich.agregarIngrediente(new Ingrediente("berenjenas al escabeche", 100));
    }
}
