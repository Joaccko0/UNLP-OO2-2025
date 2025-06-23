package main.java.ar.edu.unlp.info.oo2.alquileres;

import java.time.LocalDate;

public class PoliticaModerada implements PoliticaCancelacion{
    @Override
    public double calcularReembolso(LocalDate inicio, LocalDate cancelacion, double monto) {
        if(cancelacion.isBefore(inicio.minusDays(7))) {
            return monto;
        } else if(cancelacion.isBefore(inicio.minusDays(2))) {
            return (monto / 2);
        }
        else return 0;
    }
}
