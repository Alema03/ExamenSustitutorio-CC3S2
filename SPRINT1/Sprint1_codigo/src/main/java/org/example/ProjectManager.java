package org.example;

import java.time.LocalDate;

public class ProjectManager {
    private Project project;

    public ProjectManager(String name, String description, LocalDate startDate, LocalDate endDate) {
        this.project = new Project(name, description, startDate, endDate);
    }

    public void addTaskToProject(Task task) {
        project.addTask(task);
    }

    public void updateTaskInProject(Task task) {
        project.updateTask(task);
    }

    public void removeTaskFromProject(Task task) {
        project.removeTask(task);
    }

    // Getters y setters para Project (opcional, dependiendo de la necesidad)
    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
