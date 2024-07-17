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
    private SecurityPerspective securityPerspective;
    private AttackTrees attackTree;

    public Project(String name, String description, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.tasks = new ArrayList<>();
        this.securityPerspective = new SecurityPerspective(new ArrayList<>(), new ArrayList<>());
        this.attackTree = new AttackTrees();
    }

    public void addTask(String username, String password, Task task) throws SecurityTactics.AuthenticationException, SecurityTactics.AuthorizationException {
        SecurityTactics tactics = new SecurityTactics();
        if (!tactics.authenticate(username, password)) {
            throw new SecurityTactics.AuthenticationException("Autenticación fallida para agregar tarea.");
        }
        tasks.add(task);
        securityPerspective.getAttackNodes().put("Agregar tarea: " + task.getTitle(), true);
        notifyObservers("Tarea agregada: " + task.getTitle());
    }

    public void updateTask(String username, String password, Task task) throws SecurityTactics.AuthenticationException, SecurityTactics.AuthorizationException {
        SecurityTactics tactics = new SecurityTactics();
        if (!tactics.authenticate(username, password)) {
            throw new SecurityTactics.AuthenticationException("Autenticación fallida para actualizar tarea.");
        }
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).equals(task)) {
                tasks.set(i, task);
                securityPerspective.getAttackNodes().put("Actualizar tarea: " + task.getTitle(), true);
                break;
            }
        }
        notifyObservers("Tarea actualizada: " + task.getTitle());
    }

    public void removeTask(String username, String password, Task task) throws SecurityTactics.AuthenticationException, SecurityTactics.AuthorizationException {
        SecurityTactics tactics = new SecurityTactics();
        if (!tactics.authenticate(username, password)) {
            throw new SecurityTactics.AuthenticationException("Autenticación fallida para eliminar tarea.");
        }
        tasks.remove(task);
        securityPerspective.getAttackNodes().put("Eliminar tarea: " + task.getTitle(), true);
        notifyObservers("Tarea eliminada: " + task.getTitle());
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
