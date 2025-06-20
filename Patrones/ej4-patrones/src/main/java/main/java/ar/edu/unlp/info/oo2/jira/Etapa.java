package main.java.ar.edu.unlp.info.oo2.jira;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Etapa {

    protected ToDoItem item;

    public Etapa(ToDoItem item) {
        this.item = item;
    }

    public void start() {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en Pending");
    }

    public void togglePause() {
        throw new RuntimeException("El objeto ToDoItem no se encuentra ni en In-Progress ni en Paused");
    }

    public void finish() {
        throw new RuntimeException("El objeto ToDoItem no se encuentra ni en In-Progress ni en Paused");
    }

    public Duration workedTime() {
        return Duration.between(this.item.getInicio(), LocalDateTime.now());
    }

    public void addComment(String comment) {
        this.item.agregarComment(comment);
    }
}
