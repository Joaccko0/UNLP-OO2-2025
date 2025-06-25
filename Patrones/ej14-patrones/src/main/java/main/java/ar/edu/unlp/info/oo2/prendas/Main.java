package main.java.ar.edu.unlp.info.oo2.prendas;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Alquiler alquiler = new Alquiler(LocalDate.of(2024, 1, 3), LocalDate.of(2026, 1, 3), 1000);
        Auto auto = new Auto(LocalDate.of(2022, 1, 3), 10000, 20000);

        PrendaCombinada prendaCombinada = new PrendaCombinada();
        prendaCombinada.agregarPrenda(alquiler);
        prendaCombinada.agregarPrenda(auto);

        System.out.println("Valor del auto: " + auto.getValor());
        System.out.println("Valor del alquiler: " + alquiler.getValor());
        System.out.println("Valor de la prenda combinada: " + prendaCombinada.getValor());
    }

}
