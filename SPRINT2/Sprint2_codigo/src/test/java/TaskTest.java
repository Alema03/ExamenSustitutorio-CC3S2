import org.example.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


public class TaskTest {
    private Task task;

    @BeforeEach
    public void setUp() {
        task = new Task("Tarea de prueba", "Descripción de la tarea", "Usuario", "Pendiente", LocalDate.now());
    }

    @Test
    public void testGettersAndSetters() {
        assertEquals("Tarea de prueba", task.getTitle());
        assertEquals("Descripción de la tarea", task.getDescription());
        assertEquals("Usuario", task.getAssignedTo());
        assertEquals("Pendiente", task.getStatus());
        assertEquals(LocalDate.now(), task.getDueDate());

        task.setTitle("Tarea actualizada");
        task.setDescription("Descripción actualizada");
        task.setAssignedTo("Nuevo usuario");
        task.setStatus("En progreso");
        task.setDueDate(LocalDate.now().plusDays(1));

        assertEquals("Tarea actualizada", task.getTitle());
        assertEquals("Descripción actualizada", task.getDescription());
        assertEquals("Nuevo usuario", task.getAssignedTo());
        assertEquals("En progreso", task.getStatus());
        assertEquals(LocalDate.now().plusDays(1), task.getDueDate());
    }

}
