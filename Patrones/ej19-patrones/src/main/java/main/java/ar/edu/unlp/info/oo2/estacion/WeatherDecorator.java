package main.java.ar.edu.unlp.info.oo2.estacion;

import java.util.List;

public abstract class WeatherDecorator implements WeatherData{

    private WeatherData component;

    public WeatherDecorator(WeatherData component) {
        this.component = component;
    }

    @Override
    public double getTemperatura() {
        return this.component.getTemperatura();
    }

    @Override
    public double getPresion() {
        return this.component.getPresion();
    }

    @Override
    public double getRadiacionSolar() {
        return this.component.getRadiacionSolar();
    }

    @Override
    public List<Double> getTemperaturas() {
        return this.component.getTemperaturas();
    }

    @Override
    public String displayData() {
        return this.component.displayData();
    }
}
