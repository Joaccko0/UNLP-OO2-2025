package main.java.ar.edu.unlp.info.oo2.estacion;

import java.util.Locale;

public class MinimoDecorator extends WeatherDecorator{
    public MinimoDecorator(WeatherData component) {
        super(component);
    }

    @Override
    public String displayData() {
        double min = this.getTemperaturas().stream().min((t1, t2) -> Double.compare(t1, t2)).orElse(0.0);
        return super.displayData() + String.format(Locale.US," Mínimo: %.2f;", min);
    }
}
