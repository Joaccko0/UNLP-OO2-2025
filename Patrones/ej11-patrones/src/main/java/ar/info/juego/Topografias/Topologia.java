package ar.info.juego.Topografias;

public interface Topologia {

    public double getProporcionAgua();
    public double getProporcionTierra();
    public boolean compararConTopologiaTierra(TopologiaTierra topologia);
    public boolean compararConTopologiaAgua(TopologiaAgua topologia);
    public boolean compararConTopologiaPantano(TopologiaPantano topologia);
    public boolean compararConTopologiaMixta(TopologiaMixta topologia);
    public boolean comparar(Topologia topologia);

}
