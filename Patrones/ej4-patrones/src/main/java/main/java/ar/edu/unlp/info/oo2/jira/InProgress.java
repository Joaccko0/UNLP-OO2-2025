package main.java.ar.edu.unlp.info.oo2.jira;

import java.time.LocalDateTime;

public class InProgress extends Etapa{
    public InProgress(ToDoItem item) {
        super(item);
    }

    @Override
    public void togglePause() {
        this.item.setFin(LocalDateTime.now());
        this.item.setStage(new Paused(this.item));
    }

    @Override
    public void finish() {
        this.item.setStage(new Finished(this.item));
        this.item.setFin(LocalDateTime.now());
    }
}
