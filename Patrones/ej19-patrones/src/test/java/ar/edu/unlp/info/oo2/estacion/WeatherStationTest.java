package ar.edu.unlp.info.oo2.estacion;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

import main.java.ar.edu.unlp.info.oo2.estacion.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherStationTest {

    private WeatherData estacion;

    @BeforeEach
    public void setUp() {
        Locale.setDefault(Locale.US); // fuerza punto decimal
        this.estacion = new HomeWeatherStation(86.0, 1008, 200,
                Arrays.asList(80.6, 86.0, 89.6)); // F: [27, 30, 32]
    }

    @Test
    public void testEjemplo5_DisplayDataConCelsiusPromedioMinimoMaximo() {
        WeatherData vista = new MaximoDecorator(
                new MinimoDecorator(
                        new PromedioDecorator(
                                new HomeWeatherStationCelcius((HomeWeatherStation) this.estacion))));

        String expected = "Temperatura C: 30.00; Presión atmosf: 1008.00; Radiación solar: 200.00; Promedio: 29.67; Mínimo: 27.00; Máximo: 32.00;";
        assertEquals(expected, vista.displayData());
    }
}
