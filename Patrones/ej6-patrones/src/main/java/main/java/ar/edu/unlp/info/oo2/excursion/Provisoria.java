package main.java.ar.edu.unlp.info.oo2.excursion;

import java.util.List;

public class Provisoria extends EstadoExcursion{
    public Provisoria(Excursion excursion) {
        super(excursion);
    }

    @Override
    public String adicional() {
        List<Usuario> usuarios = this.excursion.getUsuarios();
        return "\n" + "Cantidad de Usuarios Faltantes para el Minimo: " + (excursion.getCupoMinimo() - usuarios.size());
    }

    @Override
    public void addUser(Usuario usuario) {
        excursion.agregarUsuario(usuario);
        if(excursion.getUsuarios().size() >= excursion.getCupoMinimo()) {
            excursion.setEstado(new Definitiva(excursion));
        }
    }

    @Override
    public void removeUser(Usuario usuario) {
        excursion.removerUsuario(usuario);
    }
}
