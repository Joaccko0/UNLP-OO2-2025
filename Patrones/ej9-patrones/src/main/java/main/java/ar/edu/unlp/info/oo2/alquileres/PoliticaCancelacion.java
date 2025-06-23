package main.java.ar.edu.unlp.info.oo2.alquileres;

import java.time.LocalDate;

public interface PoliticaCancelacion {
    public double calcularReembolso(LocalDate inicio, LocalDate cancelacion, double monto);
}
