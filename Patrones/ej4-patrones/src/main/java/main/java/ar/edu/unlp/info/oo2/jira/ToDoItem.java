package main.java.ar.edu.unlp.info.oo2.jira;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {

    private String nombre;
    private List<String> comments;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private Etapa etapa;

    public ToDoItem(String nombre) {
        this.nombre = nombre;
        this.comments = new ArrayList<String>();
        this.etapa = new Pending(this);
    }

    public void start() {
        this.etapa.start();
    }

    public void finish() {
        this.etapa.finish();
    }

    public void togglePause() {
        this.etapa.togglePause();
    }

    public void addComment(String comment) {
        this.etapa.addComment(comment);
    }

    protected void agregarComment(String comment) {
        this.comments.add(comment);
    }

    public Duration workedTime() {
        return this.etapa.workedTime();
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public void setStage(Etapa stage) {
        this.etapa = stage;
    }

    public Etapa getStage() {
        return this.etapa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public Etapa getEtapa() {
        return etapa;
    }

    public void setEtapa(Etapa etapa) {
        this.etapa = etapa;
    }
}
