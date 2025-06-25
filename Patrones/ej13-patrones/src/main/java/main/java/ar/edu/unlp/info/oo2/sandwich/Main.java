package main.java.ar.edu.unlp.info.oo2.sandwich;

public class Main {
    public static void main(String[] args) {
        SubteWay subte = new SubteWay();

        SandwichBuilder clasico = new SandwichClasico();
        SandwichBuilder vegetariano = new SandwichVegetariano();
        SandwichBuilder vegano = new SandwichVergano();
        SandwichBuilder sinTacc = new SandwichSinTacc();

        Sandwich s1 = subte.construirSandwich(clasico);
        Sandwich s2 = subte.construirSandwich(vegetariano);
        Sandwich s3 = subte.construirSandwich(vegano);
        Sandwich s4 = subte.construirSandwich(sinTacc);

        System.out.println("Sándwich Clásico: $" + s1.getPrecio());
        System.out.println("Sándwich Vegetariano: $" + s2.getPrecio());
        System.out.println("Sándwich Vegano: $" + s3.getPrecio());
        System.out.println("Sándwich Sin TACC: $" + s4.getPrecio());
    }
}
