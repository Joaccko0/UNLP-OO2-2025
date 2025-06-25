package main.java.ar.edu.unlp.info.oo2.sandwich;

public class SandwichClasico extends SandwichBuilder {
    @Override
    public void crearPan() {
        this.sandwich.agregarIngrediente(new Ingrediente("pan brioche", 100));
    }

    @Override
    public void crearPrincipal() {
        this.sandwich.agregarIngrediente(new Ingrediente("carne de ternera", 300));
    }

    @Override
    public void crearAderezo() {
        this.sandwich.agregarIngrediente(new Ingrediente("mayonesa", 20));
    }

    @Override
    public void crearAdicional() {
        this.sandwich.agregarIngrediente(new Ingrediente("tomate", 80));
    }
}
