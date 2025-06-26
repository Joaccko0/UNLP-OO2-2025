package main.java.ar.edu.unlp.info.oo2.estacion;

import java.util.Locale;

public class MaximoDecorator extends WeatherDecorator{
    public MaximoDecorator(WeatherData component) {
        super(component);
    }

    @Override
    public String displayData() {
        double max = this.getTemperaturas().stream().max((t1, t2) -> Double.compare(t1, t2)).orElse(0.0);
        return super.displayData() + String.format(Locale.US," Máximo: %.2f;", max);
    }
}
