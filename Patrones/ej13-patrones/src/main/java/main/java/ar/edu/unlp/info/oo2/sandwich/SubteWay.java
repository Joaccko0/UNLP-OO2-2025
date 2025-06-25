package main.java.ar.edu.unlp.info.oo2.sandwich;

public class SubteWay {
    public Sandwich construirSandwich(SandwichBuilder builder) {
        builder.crearAderezo();
        builder.crearPan();
        builder.crearPrincipal();
        builder.crearAdicional();
        return builder.getSandwich();
    }

    public double getPrecioSanguche(Sandwich sandwich) {
        return sandwich.getPrecio();
    }
}
