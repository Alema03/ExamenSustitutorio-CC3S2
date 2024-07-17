package org.example;

import java.util.Observable;
import java.util.Observer;

public class TaskObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            System.out.println(arg);
        } else if (o instanceof Project) {
            Project project = (Project) o;
            System.out.println("Proyecto creado: " + project.getName() + "\nDescripción: " + project.getDescription() + "\nFecha de inicio: " + project.getStartDate() + "\nFecha de finalización: " + project.getEndDate());
        }
    }
}
