package main.java.ar.edu.unlp.info.oo2.alquileres;

import java.time.LocalDate;

public class DemoAlquiler {
    public static void main(String[] args) {
        // Crear una política flexible
        PoliticaCancelacion flexible = new PoliticaFlexible();

        // Crear un auto con política flexible
        AutoEnAlquiler auto = new AutoEnAlquiler(1000.0, 4, "Toyota", flexible);

        // Crear una reserva que empieza el 20 de julio, por 5 días
        Usuario usuario = new Usuario("Joaquin");
        LocalDate inicio = LocalDate.of(2025, 7, 20);
        Reserva reserva = new Reserva(usuario, 5, inicio, auto);

        // Cancelar el 15 de julio (antes del inicio)
        LocalDate cancelacion = LocalDate.of(2025, 7, 15);
        double reembolsoFlexible = reserva.montoAReembolsar(cancelacion);
        System.out.println("Reembolso con política flexible: " + reembolsoFlexible);

        // Cambiar la política a moderada
        PoliticaCancelacion moderada = new PoliticaModerada();
        auto.setPolitica(moderada);

        double reembolsoModerado = reserva.montoAReembolsar(cancelacion);
        System.out.println("Reembolso con política moderada: " + reembolsoModerado);
    }
}
