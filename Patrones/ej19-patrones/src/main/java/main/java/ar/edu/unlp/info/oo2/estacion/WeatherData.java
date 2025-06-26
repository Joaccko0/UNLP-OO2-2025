package main.java.ar.edu.unlp.info.oo2.estacion;

import java.util.List;

public interface WeatherData {

    public double getTemperatura();
    public double getPresion();
    public double getRadiacionSolar();
    public List<Double> getTemperaturas();
    public String displayData();

}
