package main.java.ar.edu.unlp.info.oo2.jira;

import java.time.Duration;
import java.time.LocalDateTime;

public class Paused extends Etapa{
    public Paused(ToDoItem item) {
        super(item);
    }

    @Override
    public void togglePause() {
        this.item.setFin(null);
        this.item.setStage(new InProgress(this.item));
    }

    @Override
    public void finish() {
        this.item.setStage(new Finished(this.item));
        this.item.setFin(LocalDateTime.now());
    }

    @Override
    public Duration workedTime() {
        return Duration.between(this.item.getInicio(), this.item.getFin());
    }
}
