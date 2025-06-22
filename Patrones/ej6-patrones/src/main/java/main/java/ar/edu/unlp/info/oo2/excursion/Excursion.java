package main.java.ar.edu.unlp.info.oo2.excursion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {

    private List<Usuario> usuarios;
    private List<Usuario> usuariosEnEspera;
    private String nombre;
    private LocalDate inicio;
    private LocalDate fin;
    private String puntoEncuentro;
    private double costo;
    private int cupoMinimo;
    private int cupoMaximo;
    private EstadoExcursion estado;

    public Excursion(String nombre, LocalDate inicio, LocalDate fin, String puntoEncuentro,
                     double costo, int minimo, int maximo) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.puntoEncuentro = puntoEncuentro;
        this.costo = costo;
        this.cupoMaximo = maximo;
        this.cupoMinimo = minimo;
        this.usuarios = new ArrayList<Usuario>();
        this.usuariosEnEspera = new ArrayList<Usuario>();
        estado = new Provisoria(this);
    }

    public void inscribir(Usuario usuario) {
        this.estado.addUser(usuario);
    }

    public String obtenerInformacion() {
        return this.estado.getInformacion();
    }

    public void agregarListaDeEspera(Usuario usuario) {
        this.usuariosEnEspera.add(usuario);
    }

    public void agregarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        this.usuarios.remove(usuario);
    }

    public void setEstado(EstadoExcursion estado) {
        this.estado = estado;
    }

    public List<Usuario> getUsuarios() {
        return new ArrayList<Usuario>(this.usuarios);
    }

    public List<Usuario> getUsuariosEnEspera() {
        return new ArrayList<Usuario>(this.usuariosEnEspera);
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }

    public void setPuntoEncuentro(String puntoEncuentro) {
        this.puntoEncuentro = puntoEncuentro;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCupoMinimo() {
        return cupoMinimo;
    }

    public void setCupoMinimo(int cupoMinimo) {
        this.cupoMinimo = cupoMinimo;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }
}
