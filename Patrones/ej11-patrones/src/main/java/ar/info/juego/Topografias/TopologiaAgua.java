package ar.info.juego.Topografias;

public class TopologiaAgua implements Topologia{
    @Override
    public double getProporcionAgua() {
        return 1;
    }

    @Override
    public double getProporcionTierra() {
        return 0;
    }

    @Override
    public boolean compararConTopologiaAgua(TopologiaAgua topologia) {
        return true;
    }

    @Override
    public boolean compararConTopologiaTierra(TopologiaTierra topologia) {
        return false;
    }

    @Override
    public boolean compararConTopologiaMixta(TopologiaMixta topologia) {
        return false;
    }

    @Override
    public boolean comparar(Topologia topologia) {
        return topologia.compararConTopologiaAgua(this);
    }
}
