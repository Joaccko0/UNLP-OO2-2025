package main.java.ar.edu.unlp.info.oo2.pc;

import java.time.LocalDate;

public class Presupuesto {
    private String nombre;
    private LocalDate fecha;
    private PC pc;

    public Presupuesto(String nombre, LocalDate fecha, PCBuilder builder) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.pc = builder.getPC();
    }

    public double calcularConsumo() {
        return this.pc.calcularConsumo();
    }

    public double calcularPrecio() {
        return this.calcularPrecio() * 1.21;
    }
}
