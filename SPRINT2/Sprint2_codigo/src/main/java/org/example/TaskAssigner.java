package org.example;

public class TaskAssigner {
    private Strategy strategy;

    public TaskAssigner(Strategy strategy) {
        this.strategy = strategy;
    }

    public void assignTask(Task task) {
        String assignedTo = strategy.assign(task);
        task.setAssignedTo(assignedTo);
    }

    // Getters y setters para Strategy
    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}