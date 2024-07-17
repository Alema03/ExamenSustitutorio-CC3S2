package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ProjectManager projectManager = new ProjectManager("Proyecto Alfa", "Este es un proyecto de prueba", LocalDate.of(2024, 7, 16), LocalDate.of(2025, 1, 16));
        TaskObserver observer = new TaskObserver();
        projectManager.getProject().addObserver(observer);

        Task task1 = new Task("Implementar inicio de sesión", "Desarrollar funcionalidad de inicio de sesión", "Kapu", "Abierta", LocalDate.of(2024, 7, 30));
        projectManager.addTaskToProject(task1);

        task1.setStatus("En progreso");
        projectManager.updateTaskInProject(task1);

        projectManager.removeTaskFromProject(task1);

        Task task2 = new Task("Implementar cierre de sesión", "Desarrollar funcionalidad de cierre de sesión", "", "Abierta", LocalDate.of(2024, 7, 30));
        Strategy strategy = new ConcreteStrategyA();
        TaskAssigner taskAssigner = new TaskAssigner(strategy);
        taskAssigner.assignTask(task2);
        projectManager.addTaskToProject(task2);
    }
}
