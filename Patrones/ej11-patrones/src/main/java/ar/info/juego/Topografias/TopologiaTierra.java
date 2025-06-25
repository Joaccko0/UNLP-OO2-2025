package ar.info.juego.Topografias;

public class TopologiaTierra implements Topologia{
    @Override
    public double getProporcionAgua() {
        return 0;
    }

    @Override
    public double getProporcionTierra() {
        return 1;
    }

    @Override
    public boolean compararConTopologiaAgua(TopologiaAgua topologia) {
        return false;
    }

    @Override
    public boolean compararConTopologiaTierra(TopologiaTierra topologia) {
        return true;
    }

    @Override
    public boolean compararConTopologiaMixta(TopologiaMixta topologia) {
        return false;
    }

    @Override
    public boolean comparar(Topologia topologia) {
        return topologia.compararConTopologiaTierra(this);
    }
}
