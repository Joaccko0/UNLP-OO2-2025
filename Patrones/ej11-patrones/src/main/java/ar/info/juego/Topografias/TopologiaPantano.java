package ar.info.juego.Topografias;

public class TopologiaPantano implements Topologia{
    @Override
    public double getProporcionAgua() {
        return 0.7;
    }

    @Override
    public double getProporcionTierra() {
        return 0.3;
    }

    @Override
    public boolean compararConTopologiaTierra(TopologiaTierra topologia) {
        return false;
    }

    @Override
    public boolean compararConTopologiaAgua(TopologiaAgua topologia) {
        return false;
    }

    @Override
    public boolean compararConTopologiaMixta(TopologiaMixta topologia) {
        return false;
    }

    @Override
    public boolean compararConTopologiaPantano(TopologiaPantano topologia) {
        return true;
    }

    @Override
    public boolean comparar(Topologia topologia) {
        return topologia.compararConTopologiaPantano(this);
    }
}
