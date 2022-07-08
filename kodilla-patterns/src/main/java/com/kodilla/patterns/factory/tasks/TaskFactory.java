package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Zakupy babci", "Szarlotka", 2);
            case DRIVING:
                return new DrivingTask("Wakacje", "Warszawa", "Opel Astra");
            case PAINTING:
                return new PaintingTask("Malowanie kuchni", "Biały", "Kuchnia");
            default:
                return null;
        }
    }
}