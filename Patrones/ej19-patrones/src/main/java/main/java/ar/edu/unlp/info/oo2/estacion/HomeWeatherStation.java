package main.java.ar.edu.unlp.info.oo2.estacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class HomeWeatherStation implements WeatherData{

    private double temperatura;
    private double presion;
    private double radiacionSolar;
    private List<Double> temperaturas;

    public HomeWeatherStation(double temperatura, double presion, double radiacionSolar, List<Double> temperaturas) {
        this.temperatura = temperatura;
        this.presion = presion;
        this.radiacionSolar = radiacionSolar;
        this.temperaturas = new ArrayList<Double>(temperaturas);
    }

    @Override
    public double getTemperatura() {
        return this.temperatura;
    }

    @Override
    public double getPresion() {
        return this.presion;
    }

    @Override
    public double getRadiacionSolar() {
        return this.radiacionSolar;
    }

    @Override
    public List<Double> getTemperaturas() {
        return this.temperaturas;
    }

    @Override
    public String displayData() {
        return String.format(Locale.US,"Temperatura F: %.2f; Presión atmosf: %.2f; Radiación solar: %.2f;",
                this.getTemperatura(), this.getPresion(), this.getRadiacionSolar());
    }
}
