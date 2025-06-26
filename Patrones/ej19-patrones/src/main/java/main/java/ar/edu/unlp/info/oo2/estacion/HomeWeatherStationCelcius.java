package main.java.ar.edu.unlp.info.oo2.estacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class HomeWeatherStationCelcius implements WeatherData{

    private HomeWeatherStation adaptee;

    public HomeWeatherStationCelcius(HomeWeatherStation adaptee) {
        this.adaptee = adaptee;
    }

    private double getCelcius(double f) {
        return ((f - 32) / 1.8);
    }

    @Override
    public double getTemperatura() {
        return this.getCelcius(this.adaptee.getTemperatura());
    }

    @Override
    public double getPresion() {
        return this.adaptee.getPresion();
    }

    @Override
    public double getRadiacionSolar() {
        return this.adaptee.getRadiacionSolar();
    }

    @Override
    public List<Double> getTemperaturas() {
        return this.adaptee.getTemperaturas().stream()
                .map(f -> this.getCelcius(f))
                .collect(Collectors.toList());
    }

    @Override
    public String displayData() {
        return String.format(Locale.US,"Temperatura C: %.2f; Presión atmosf: %.2f; Radiación solar: %.2f;",
                this.getTemperatura(), this.getPresion(), this.getRadiacionSolar());
    }
}
