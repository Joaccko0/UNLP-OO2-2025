package ar.info.juego.Topografias;

import java.util.ArrayList;
import java.util.List;

public class TopologiaMixta implements Topologia{

    private List<Topologia> topologias;

    public TopologiaMixta() {
        this.topologias = new ArrayList<Topologia>(4);
    }

    public void agregarTopologia(Topologia topologia) {
        if(this.topologias.size() <= 3) {
            this.topologias.add(topologia);
        }
    }

    @Override
    public double getProporcionAgua() {
        return (this.topologias.stream()
                .mapToDouble(t -> t.getProporcionAgua())
                .sum()) / 4;
    }

    @Override
    public double getProporcionTierra() {
        return (this.topologias.stream()
                .mapToDouble(t -> t.getProporcionTierra())
                .sum()) / 4;
    }

    @Override
    public boolean compararConTopologiaAgua(TopologiaAgua topologia) {
        return false;
    }

    @Override
    public boolean compararConTopologiaTierra(TopologiaTierra topologia) {
        return false;
    }

    @Override
    public boolean compararConTopologiaMixta(TopologiaMixta topologia) {
        return (this.getProporcionAgua() == topologia.getProporcionAgua());
    }

    @Override
    public boolean comparar(Topologia topologia) {
        return topologia.compararConTopologiaMixta(this);
    }
}
