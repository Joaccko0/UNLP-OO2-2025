package main.java.ar.edu.unlp.info.oo2.jira;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends Etapa{
    public Pending(ToDoItem item) {
        super(item);
    }

    @Override
    public void start() {
        this.item.setStage(new InProgress(this.item));
        this.item.setInicio(LocalDateTime.now());
    }

    @Override
    public Duration workedTime() {
        throw new RuntimeException("El objeto ToDoItem se encuentra en estado Pending");
    }
}
