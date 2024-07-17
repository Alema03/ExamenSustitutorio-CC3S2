package org.example;

import java.time.LocalDate;
import java.util.Objects;

import java.time.LocalDate;

public class Task {
    private String title;
    private String description;
    private String assignedTo;
    private String status; // Puede ser "Pendiente", "En progreso", "Completada".
    private LocalDate dueDate;

    public Task(String title, String description, String assignedTo, String status, LocalDate dueDate) {
        this.title = title;
        this.description = description;
        this.assignedTo = assignedTo;
        this.status = status;
        this.dueDate = dueDate;
    }

    // Getters y setters para atributos

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
