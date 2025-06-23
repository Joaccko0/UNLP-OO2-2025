package main.java.ar.edu.unlp.info.oo2.alquileres;

import java.time.LocalDate;

public class PoliticaFlexible implements PoliticaCancelacion{
    @Override
    public double calcularReembolso(LocalDate inicio, LocalDate cancelacion, double monto) {
        if(cancelacion.isBefore(inicio)) {
            return monto;
        } else {
            return 0;
        }
    }
}
