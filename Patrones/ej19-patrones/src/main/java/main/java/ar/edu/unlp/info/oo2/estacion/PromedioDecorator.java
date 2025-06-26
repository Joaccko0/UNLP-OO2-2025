package main.java.ar.edu.unlp.info.oo2.estacion;

import java.util.Locale;

public class PromedioDecorator extends WeatherDecorator{
    public PromedioDecorator(WeatherData component) {
        super(component);
    }

    @Override
    public String displayData() {
        double prom = this.getTemperaturas().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        return super.displayData() + String.format(Locale.US," Promedio: %.2f;", prom);
    }
}
