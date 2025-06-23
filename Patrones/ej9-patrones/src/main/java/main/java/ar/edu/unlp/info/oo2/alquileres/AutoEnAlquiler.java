package main.java.ar.edu.unlp.info.oo2.alquileres;

import java.time.LocalDate;

public class AutoEnAlquiler {

    private double precioPorDia;
    private int cantidadPlazas;
    private String marca;
    private PoliticaCancelacion politica;

    public AutoEnAlquiler(double precio, int plazas, String marca, PoliticaCancelacion politica) {
        this.cantidadPlazas = plazas;
        this.precioPorDia = precio;
        this.marca = marca;
        this.politica = politica;
    }

    public double getPrecioPorDia() {
        return this.precioPorDia;
    }

    public void setPolitica(PoliticaCancelacion politica) {
        this.politica = politica;
    }

    public double montoAReembolsar(LocalDate inicio, LocalDate cancelacion, double monto) {
        return this.politica.calcularReembolso(inicio, cancelacion, monto);
    }
}
