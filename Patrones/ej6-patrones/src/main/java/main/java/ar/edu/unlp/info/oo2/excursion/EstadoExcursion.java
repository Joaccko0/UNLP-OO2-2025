package main.java.ar.edu.unlp.info.oo2.excursion;

public abstract class EstadoExcursion {
    protected Excursion excursion;

    public EstadoExcursion(Excursion excursion) {
        this.excursion = excursion;
    }

    public String getInformacion() {
        String aux = "Excursion: " + excursion.getNombre() + "\n"
                + "Costo: " + excursion.getCosto() + "\n"
                + "Fecha Inicio: " + excursion.getInicio() + "\n"
                + "Fecha Fin: " + excursion.getFin() + "\n"
                + "Punto de Encuentro: " + excursion.getPuntoEncuentro();
        aux += this.adicional();
        return aux;
    }
    public abstract String adicional();
    public abstract void addUser(Usuario usuario);
    public abstract void removeUser(Usuario usuario);
}
