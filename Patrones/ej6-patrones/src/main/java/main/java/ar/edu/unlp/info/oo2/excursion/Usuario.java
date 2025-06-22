package main.java.ar.edu.unlp.info.oo2.excursion;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private String apellido;
    private String mail;
    private List<Excursion> excursiones;

    public Usuario(String nombre, String apellido, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.excursiones = new ArrayList<Excursion>();
    }

    public void agregarExcursion(Excursion excursion) {
        this.excursiones.add(excursion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<Excursion> getExcursiones() {
        return excursiones;
    }

    public void setExcursiones(List<Excursion> excursiones) {
        this.excursiones = excursiones;
    }
}
