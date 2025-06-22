package main.java.ar.edu.unlp.info.oo2.excursion;

import java.util.List;

public class Definitiva extends EstadoExcursion{
    public Definitiva(Excursion excursion) {
        super(excursion);
    }

    @Override
    public String adicional() {
        List<Usuario> usuarios = this.excursion.getUsuarios();
        String aux = "\n" + "Mails de los Usuarios Inscriptos:";
        for(int i = 0; i < usuarios.size(); i++) {
            aux += "\n" + usuarios.get(i).getMail();
        }
        aux += "\n" + "Cantidad de Usuarios Faltantes para el Maximo: " + (excursion.getCupoMaximo() - usuarios.size());
        return aux;
    }

    @Override
    public void addUser(Usuario usuario) {
        excursion.agregarUsuario(usuario);
        if(excursion.getUsuarios().size() >= excursion.getCupoMaximo()) {
            excursion.setEstado(new Llena(excursion));
        }
    }

    @Override
    public void removeUser(Usuario usuario) {
        excursion.removerUsuario(usuario);
        if(excursion.getUsuarios().size() < excursion.getCupoMinimo()) {
            excursion.setEstado(new Provisoria(excursion));
        }
    }
}
