package main.java.ar.edu.unlp.info.oo2.jira;

import java.time.Duration;

public class Finished extends Etapa{
    public Finished(ToDoItem item) {
        super(item);
    }

    @Override
    public Duration workedTime() {
        return Duration.between(this.item.getInicio(), this.item.getFin());
    }

    @Override
    public void addComment(String comment) {
        throw new RuntimeException("El objeto ToDoItem se encuentra en estado Finished");
    }
}
