package main.java.ar.edu.unlp.info.oo2.excursion;

public class Llena extends EstadoExcursion{
    public Llena(Excursion excursion) {
        super(excursion);
    }

    @Override
    public String adicional() {
        return "";
    }

    @Override
    public void addUser(Usuario usuario) {
        this.excursion.agregarListaDeEspera(usuario);
    }

    @Override
    public void removeUser(Usuario usuario) {
        this.excursion.removerUsuario(usuario);
        if(!excursion.getUsuariosEnEspera().isEmpty()) {
            this.excursion.agregarUsuario(excursion.getUsuariosEnEspera().get(0));
        } else {
            this.excursion.setEstado(new Definitiva(excursion));
        }
    }
}
