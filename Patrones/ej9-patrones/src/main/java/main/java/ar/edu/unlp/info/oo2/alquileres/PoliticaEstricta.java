package main.java.ar.edu.unlp.info.oo2.alquileres;

import java.time.LocalDate;

public class PoliticaEstricta implements PoliticaCancelacion{
    @Override
    public double calcularReembolso(LocalDate inicio, LocalDate cancelacion, double monto) {
        return 0;
    }
}
