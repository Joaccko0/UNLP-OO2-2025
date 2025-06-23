package main.java.ar.edu.unlp.info.oo2.alquileres;

import java.time.LocalDate;

public class Reserva {
    private Usuario conductor;
    private AutoEnAlquiler auto;
    private int cantidadDias;
    private LocalDate fecha;

    public Reserva(Usuario conductor, int dias, LocalDate inicio, AutoEnAlquiler auto) {
        this.cantidadDias = dias;
        this.conductor = conductor;
        this.fecha = inicio;
        this.auto = auto;
    }

    public double montoAPagar() {
        return this.auto.getPrecioPorDia() * this.cantidadDias;
    }

    public double montoAReembolsar(LocalDate fechaCancelacion) {
        return this.auto.montoAReembolsar(this.fecha, fechaCancelacion, this.montoAPagar());
    }
}
