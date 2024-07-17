package org.example;

public class ConcreteStrategyA implements Strategy {
    @Override
    public String assign(Task task) {
        return "Motita";
    }
}
