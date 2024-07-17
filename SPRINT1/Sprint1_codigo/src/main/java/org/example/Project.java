package org.example;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.Observable;

public class Project extends Observable {
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<Task> tasks;

    public Project(String name, String description, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        setChanged();
        notifyObservers("Tarea agregada: " + task.getTitle() + "\nDescripción: " + task.getDescription() + "\nAsignada a: " + task.getAssignedTo() + "\nEstado: " + task.getStatus() + "\nFecha de vencimiento: " + task.getDueDate());
    }

    public void updateTask(Task task) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).equals(task)) {
                tasks.set(i, task);
                setChanged();
                notifyObservers("Tarea actualizada: " + task.getTitle() + "\nNuevo estado: " + task.getStatus());
                return;
            }
        }
    }

    public void removeTask(Task task) {
        if (tasks.remove(task)) {
            setChanged();
            notifyObservers("Tarea eliminada: " + task.getTitle());
        }
    }

    // Getters y setters para atributos

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setChanged();
        notifyObservers();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        setChanged();
        notifyObservers();
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
        setChanged();
        notifyObservers();
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
        setChanged();
        notifyObservers();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
        setChanged();
        notifyObservers();
    }
}
