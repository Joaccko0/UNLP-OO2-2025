package ar.edu.unlp.info.oo2.jira;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import main.java.ar.edu.unlp.info.oo2.jira.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToDoItemTest {

    private ToDoItem taskSinIniciar;
    private ToDoItem taskInProgress;
    private ToDoItem taskPaused;
    private ToDoItem taskFinished;

    @BeforeEach
    void setUp() throws Exception {
        taskSinIniciar = new ToDoItem("task 1");
        taskInProgress = new ToDoItem("task 2");
        taskPaused = new ToDoItem("task 3");
        taskFinished = new ToDoItem("task 4");

        taskInProgress.start();
        taskPaused.start();
        taskPaused.togglePause();
        taskFinished.start();
        Thread.sleep(10); // Espera mínima para que haya diferencia en tiempo trabajado
        taskFinished.finish();
    }

    // Pending
    @Test
    void testPendingStart() {
        taskSinIniciar.start();
        assertTrue(taskSinIniciar.getStage() instanceof InProgress);
        assertNotNull(taskSinIniciar.getInicio());
    }

    @Test
    void testPendingTogglePauseThrows() {
        Exception e = assertThrows(RuntimeException.class, () -> taskSinIniciar.togglePause());
        assertEquals("El objeto ToDoItem no se encuentra ni en In-Progress ni en Paused", e.getMessage());
    }

    @Test
    void testPendingFinishDoesNothing() {
        Exception e = assertThrows(RuntimeException.class, () -> taskSinIniciar.finish());
        assertEquals("El objeto ToDoItem no se encuentra ni en In-Progress ni en Paused", e.getMessage());
        assertTrue(taskSinIniciar.getStage() instanceof Pending);
    }

    @Test
    void testPendingWorkedTimeThrows() {
        Exception e = assertThrows(RuntimeException.class, () -> taskSinIniciar.workedTime());
        assertEquals("El objeto ToDoItem se encuentra en estado Pending", e.getMessage());
    }

    @Test
    void testPendingAddCommentAdds() {
        taskSinIniciar.addComment("Comentario 1");
        assertEquals(1, taskSinIniciar.getComments().size());
    }

    // InProgress
    @Test
    void testInProgressTogglePauseToPaused() {
        taskInProgress.togglePause();
        assertTrue(taskInProgress.getStage() instanceof Paused);
    }

    @Test
    void testInProgressFinishToFinished() {
        taskInProgress.finish();
        assertTrue(taskInProgress.getStage() instanceof Finished);
        assertNotNull(taskInProgress.getFin());
    }

    @Test
    void testInProgressWorkedTimePositive() {
        Duration d = taskInProgress.workedTime();
        assertFalse(d.isNegative());
    }

    @Test
    void testInProgressAddComment() {
        taskInProgress.addComment("Comentario activo");
        assertEquals(1, taskInProgress.getComments().size());
    }

    // Paused
    @Test
    void testPausedTogglePauseToInProgress() {
        taskPaused.togglePause();
        assertTrue(taskPaused.getStage() instanceof InProgress);
    }

    @Test
    void testPausedFinishToFinished() {
        taskPaused.finish();
        assertTrue(taskPaused.getStage() instanceof Finished);
    }

    @Test
    void testPausedWorkedTimePositive() {
        Duration d = taskPaused.workedTime();
        assertFalse(d.isNegative());
    }

    @Test
    void testPausedAddComment() {
        taskPaused.addComment("Comentario pausado");
        assertEquals(1, taskPaused.getComments().size());
    }

    // Finished
    @Test
    void testFinishedWorkedTimeCorrect() {
        Duration d = taskFinished.workedTime();
        assertEquals(Duration.between(taskFinished.getInicio(), taskFinished.getFin()), d);
    }

    @Test
    void testFinishedAddCommentIgnored() {
        Exception e = assertThrows(RuntimeException.class, () -> taskFinished.addComment("Comentario fuera de tiempo"));
        assertEquals("El objeto ToDoItem se encuentra en estado Finished", e.getMessage());
        assertEquals(0, taskFinished.getComments().size());
    }

    @Test
    void testFinishedTogglePauseThrows() {
        Exception e = assertThrows(RuntimeException.class, () -> taskFinished.togglePause());
        assertEquals("El objeto ToDoItem no se encuentra ni en In-Progress ni en Paused", e.getMessage());
    }
}