import org.example.Project;
import org.example.Task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjectTest {
    private Project project;

    @BeforeEach
    public void setUp() {
        project = new Project("Proyecto Test", "Descripción de prueba", LocalDate.now(), LocalDate.now().plusMonths(1));
    }

    @Test
    public void testAddTask() {
        Task task = new Task("Tarea de prueba", "Descripción de la tarea", "Usuario", "Pendiente", LocalDate.now());
        project.addTask(task);
        List<Task> tasks = project.getTasks();
        assertEquals(1, tasks.size());
        assertEquals(task, tasks.get(0));
    }

    @Test
    public void testStatus() {
        Task task = new Task("Tarea de prueba", "Descripción de la tarea", "Usuario", "Pendiente", LocalDate.now());
        project.addTask(task);


        List<Task> tasks = project.getTasks();
        assertEquals(1, tasks.size());
        assertEquals("Pendiente", task.getStatus());
    }

    @Test
    public void testRemoveTask() {
        Task task = new Task("Tarea de prueba", "Descripción de la tarea", "Usuario", "Pendiente", LocalDate.now());
        project.addTask(task);

        project.removeTask(task);

        List<Task> tasks = project.getTasks();
        assertEquals(0, tasks.size());
    }
}
